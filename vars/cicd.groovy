def newGit(repo)
{
  git "${repo}"
}
def newBuild()
{
  sh 'mvn package'
}
def newDeployment(filepath, ipAdress, contextPath)
{
  sh "scp /var/lib/jenkins/workspace/${filepath}/webapp/target/webapp.war ubuntu@${ipAdress}:/var/lib/tomcat9/webapps/${contextPath}"
 }
 def Testing(filepath1)
 {
  sh 'java -jar /var/lib/jenkins/workspace/${filepath1}/testing.jar'
 }
