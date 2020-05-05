node {
    checkout scm
	def image = docker.build("Docker/demo:${env.BUILD_ID}")
	
	image.inside {
		RUN mvn dependency:go-offline -B
		COPY  . .
		RUN mvn test
		}

    }
}