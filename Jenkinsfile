pipeline {
    agent { dockerfile true }
    stages {
        stage('Test') {
            steps {
            	WORKDIR /root/app

				COPY pom.xml .
				
				RUN mvn dependency:go-offline -B
				
				COPY  . .
				
				RUN mvn test
            }
        }
    }
}