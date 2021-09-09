def call()
{
  nexusArtifactUploader artifacts: [[artifactId: "${artifactid}", classifier: '', file: "${file_path}", type: "${type}"]], credentialsId: 'b57b0d75-f3da-4eb5-a5e0-f00317a8e03d', groupId: "${group_id}", nexusUrl: '192.168.87.128:8082', nexusVersion: 'nexus3', protocol: 'http', repository: 'maven-releases', version: "${version}"
}
