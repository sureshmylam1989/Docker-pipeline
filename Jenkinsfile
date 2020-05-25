pipeline {
    agent { dockerfile true }
    stages {
        stage('Test') {
            steps {
				echo "This is my first jenkins pipeline using docker"
				sh "mvn -version"
				sh "java -version"
            }
        }
    }
}