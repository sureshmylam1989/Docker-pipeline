pipeline {
    agent any
    stages {
        stage('Test') {
            steps {
                docker.build("anandr72/nodeapp")
            }
        }
    }
}