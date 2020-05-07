pipeline {
    agent { dockerfile true }
    stages {
        stage('Test') {
            steps {
            	withEnv(['PATH+EXTRA=/usr/local/bin']) {
    				echo "hello"
  				}
                
            }
        }
    }
}