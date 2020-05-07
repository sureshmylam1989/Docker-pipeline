pipeline {
	environment {
	  PATH = "/usr/local/bin:/usr/bin"
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