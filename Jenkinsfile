pipeline {
    agent any
    options {
        skipStagesAfterUnstable()
    }
    stages {
        stage('Build') {
            steps {
                sh './gradlew clean build --no-daemon'
            }
        }
        stage('Test') {
            steps {
                sh './gradlew clean test --no-daemon'
            }
        }
    }
}
