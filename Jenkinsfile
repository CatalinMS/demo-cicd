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
                def customImage = docker.build("my-image:letest")

                customImage.inside {
                    sh 'make test'
                }
            }
        }
    }
}
