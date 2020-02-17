pipeline {
    agent any
    options {
        skipStagesAfterUnstable()
    }
    stages {
        stage('Build') {
            steps {
                sh './gradlew clean build'
            }
        }
        stage ('Docker build') {
            steps {
                sh 'docker build -t catalinms/demo:latest .'
            }
        }
    }
}
