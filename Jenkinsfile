pipeline {
    agent none
    stages {
        stage('Build') {
            agent any
            steps {
                sh './gradlew clean build'
            }
        }
        stage('Docker Build') {
          agent any
          steps {
            sh 'docker build -t catalinms/demo:latest .'
          }
        }
    }
}
