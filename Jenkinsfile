pipeline {
	
    agent { dockerfile true }
    stages {
        stage('Test') {
            steps {
            	environment {
	  				PATH = "/usr/bin"
				}
            	withEnv(["PATH+EXTRA=$PATH"]) {
    				echo "hello"
  				}
                
            }
        }
    }
}