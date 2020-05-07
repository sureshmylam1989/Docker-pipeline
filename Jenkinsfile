pipeline {
	environment {
		PATH = "/usr/bin"
	}
    agent { dockerfile true }
    stages {
        stage('Test') {
            steps {
            	
            	withEnv(["PATH+EXTRA=$PATH"]) {
    				echo "hello"
  				}
                
            }
        }
    }
}