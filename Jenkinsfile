pipeline {
    agent { dockerfile true }
    stages {
        stage('Test') {
            steps {
				echo "hello"
				sh "ls /tmp"
				sh "mvn --version"
            }
        }
    }
}