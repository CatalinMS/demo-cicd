pipeline {
    agent none
    stages {
        stage('Pre-test') {
            agent any
            steps {
                sh 'echo "Pre-test"'
            }
        }
        stage('Build') {
            agent any
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
