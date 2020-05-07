pipeline {
    agent { dockerfile true }
    stages {
        stage('Test') {
            steps {
            docker.image("dockerServer").inside {
            	echo "hello"
            	}
            }
        }
    }
}