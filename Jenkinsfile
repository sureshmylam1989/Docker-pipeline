node {
	agent { 
		dockerfile true 
	}
	stages {
        stage('Create Container') {
            steps {
                echo 'Container created'
                sh 'mvn --version'
                docker.build("Docker/demo:${env.BUILD_ID}")
            }
        }
        
        stage('checkout SCM') {
            steps {
            	checkout scm  
            }
        }
        
        stage('Test') {
            steps {
            	checkout scm
            	RUN mvn dependency:go-offline -B
				COPY  . .
				RUN mvn test    
            }
        }
    }
}