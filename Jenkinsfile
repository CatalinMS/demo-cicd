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
                sh 'docker build --rm -t catalinmoldovan/demo-cicd:latest .'
            }
        }
        stage('Docker Push') {
            agent any
            steps {
                withCredentials([usernamePassword(credentialsId: 'docker-hub', passwordVariable: 'PASSWORD', usernameVariable: 'USERNAME')]) {
                    sh 'echo $USERNAME'
                    echo USERNAME
                    sh "docker login -u ${USERNAME} -p ${PASSWORD}"
                    sh 'docker push catalinmoldovan/demo-cicd:latest'
                }
            }
        }
    }
}
