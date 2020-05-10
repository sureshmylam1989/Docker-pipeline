pipeline {
    agent { dockerfile true }
    stages {
        stage('Test') {
            steps {
            	COPY  . /tmp	
				WORKDIR /tmp
				RUN mvn test
            }
        }
    }
}