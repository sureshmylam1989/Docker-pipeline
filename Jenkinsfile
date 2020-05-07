pipeline {
    agent {label dockerServer}
    stages {
        stage('Test') {
            steps {
	            agent {dockerfile true }
            	echo "hello"
            }
        }
    }
}