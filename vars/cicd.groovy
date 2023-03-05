def newGit(repo)
{
  git "${repo}"
}
def newBuild()
{
  sh 'maven package'
}
def newDeployment(path, ipAdress, contextPath)
{
  sh "scp /var/lib/jenkins/workspace/${Path}/webapp/target/webapp.war ubuntu@${ipAdress}:/var/lib/tomcat9/webapps/${contextPath}.war"
 }
 def Testing(path)
 {
  sh 'java -jar /var/lib/jenkins/workspace/${path}/testing.jar'
 }
