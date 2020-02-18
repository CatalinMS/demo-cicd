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
            steps {
                sh 'node --version'
            }
        }
    }
}