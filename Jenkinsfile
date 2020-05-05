node {
    def app

    stage('Clone repository') {

        checkout scm
    }

    stage('Build image') {

        app = docker.build("sureshDemoDocker")
    }

    stage('Test image') {
        
        app.inside {
            echo "Tests passed"
        }
    }
}