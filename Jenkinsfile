pipeline {
    agent { dockerfile true }
    stages {
        stage('Test') {
            steps {
	            agent {
	                docker { image 'jenkins/jenkins' }
	            }
            	echo "hello"
            }
        }
    }
}