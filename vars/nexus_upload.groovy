def call()
{
nexusArtifactUploader artifacts: [[artifactId: 'wwp', classifier: '', file: 'target/wwp-1.0.0.war', type: 'war']], credentialsId: 'b57b0d75-f3da-4eb5-a5e0-f00317a8e03d', groupId: 'koddas.web.wa', nexusUrl: '192.168.87.128:8082', nexusVersion: 'nexus3', protocol: 'http', repository: 'maven-releases', version: '1.4'
}
