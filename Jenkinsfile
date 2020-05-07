pipeline {
	environment {
	  STUFF = "/sbin:/usr/sbin:/usr/bin:/usr/local/bin:/bin"
	}
    agent { dockerfile true }
    stages {
        stage('Test') {
            steps {
            	withEnv(["PATH+EXTRA=$STUFF"]) {
    				echo "hello"
  					}
                
            }
        }
    }
}