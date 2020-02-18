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
                sh 'docker build -t catalinms/demo-cicd:latest .'
            }
        }
        stage('Docker Push') {
            steps {
                withCredentials([usernamePassword(credentialsId: 'docker-hub', passwordVariable: 'PASSWORD', usernameVariable: 'USERNAME')]) {
                    sh 'echo $USERNAME'
                    echo USERNAME
                    sh "docker login -u ${USERNAME} -p ${PASSWORD}"
                    sh 'docker push catalinms/demo-cicd:latest'
                }
            }
        }
    }
}
