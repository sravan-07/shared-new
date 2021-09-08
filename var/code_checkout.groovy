def call()
{
 checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[credentialsId: '8aa1e2b0-4664-41ba-920a-de369eb199e2', url: 'https://github.com/koddas/war-web-project.git']]]) 
}
