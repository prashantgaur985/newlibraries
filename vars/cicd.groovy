def newGit(repo)
{
    git "${repo}"
}
def newMaven()
{
    sh 'mvn package'
}
def newDeploy(ip,appname)
{
    deploy adapters: [tomcat9(credentialsId: 'f7aa2c36-7975-478e-9ffe-0be65ffeff46', path: '', url: "${ip}")], contextPath: "${appname}", war: '**/*.war'
}
def newTest(jobname)
{
    sh 'java -jar /var/lib/jenkins/workspace/${jobname}/testing.jar'
}

