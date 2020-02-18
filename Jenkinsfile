pipeline {
    agent any
    stages {
        stage('Pre-test') {
            steps {
                sh 'echo "Pre-test"'
            }
        }
        stage('Build') {
            steps {
                sh './gradlew clean build'
            }
        }
        stage('Front-end') {
            agent {
                docker { image 'node:7-alpine' }
            }
            steps {
                sh 'node --version'
            }
        }
    }
}