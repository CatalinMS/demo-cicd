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
                sh 'docker build --rm -t catalinmoldovan/demo-cicd:${BRANCH_NAME}-${BUILD_NUMBER} .'
            }
        }
        stage('Docker Push') {
            steps {
                withCredentials([usernamePassword(credentialsId: 'docker-hub', passwordVariable: 'PASSWORD', usernameVariable: 'USERNAME')]) {
                    sh "docker login -u ${USERNAME} -p ${PASSWORD}"
                    sh 'docker push catalinmoldovan/demo-cicd:${BRANCH_NAME}-${BUILD_NUMBER}'
                }
            }
        }
    }
}
