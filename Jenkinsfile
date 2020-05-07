pipeline {
    agent { dockerfile true }
    stages {
        stage('Test') {
            steps {
            	withEnv(['PATH+EXTRA=/usr/sbin:/usr/bin:/sbin:/bin']) {
    				echo "hello"
  				}
                
            }
        }
    }
}