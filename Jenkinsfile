pipeline {
    agent { dockerfile true }
    stages {
        stage('Test') {
            steps {
				mvn install /tmp/pom.xml
            }
        }
    }
}