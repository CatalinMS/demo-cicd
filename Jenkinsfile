pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh './gradlew clean build'
            }
        }
        stage('Docker Build') {
          steps {
            sh 'docker build -t catalinms/demo:latest .'
          }
        }
    }
}
