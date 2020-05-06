pipeline {
    agent any
    stages {
        stage('Test') {
            steps {
                docker.build("openjdk:8-jdk")
            }
        }
    }
}