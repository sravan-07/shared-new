def call()
{
 checkout([$class: 'GitSCM', branches: [[name: "${branch}"]], extensions: [], userRemoteConfigs: [[credentialsId: '8aa1e2b0-4664-41ba-920a-de369eb199e2', url: "${repo_host}"]]])
}
