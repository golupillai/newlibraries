def newgit(repo)
{
  git "${repo}"
}
def newmaven()
{
  sh 'mvn package'
}
def newdeploy(ip,appname)
{
  deploy adapters: [tomcat9(credentialsId: 'd9b47c61-c6e1-4b8c-aa52-89c6e8c30971', path: '', url: "${ip}" )], contextPath: "${appname}", war: '**/*.war'
}
