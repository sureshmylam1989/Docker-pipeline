pipeline {
    agent { dockerfile true }
    stages {
        stage('Test') {
            steps {
            	COPY  . /root/app/	
				WORKDIR /root/app
				RUN mvn test
            }
        }
    }
}