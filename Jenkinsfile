pipeline {
    agent { dockerfile true }
    stages {
        stage('Test') {
            steps {
            docker.withTool('dockerInstallation') { echo "hello" }
            	
            }
        }
    }
}