pipeline {
    agent { dockerfile true }
    stages {
        stage('Test') {
            steps {
            	withEnv(['PATH+EXTRA=/usr/bin']) {
    				echo "hello"
  				}
                
            }
        }
    }
}