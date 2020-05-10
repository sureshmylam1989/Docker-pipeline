pipeline {
    agent { dockerfile true }
    stages {
        stage('Test') {
            steps {
            	COPY pom.xml  /tmp
				WORKDIR /tmp
				RUN mvn test
            }
        }
    }
}