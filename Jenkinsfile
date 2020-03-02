def dockerPush(String username, String password) {
    echo username
    echo password
    sh "docker login -u username -p password"
    sh 'docker push catalinmoldovan/demo-cicd:latest'
}

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
                echo env.BUILD_NUMBER
                sh 'docker build --rm -t catalinmoldovan/demo-cicd:${BRANCH_NAME}-${BUILD_NUMBER} .'
            }
        }
        stage('Docker Push') {
//             when {
//                 branch 'master'
//             }
            steps {
                withCredentials([usernamePassword(credentialsId: 'docker-hub', passwordVariable: 'PASSWORD', usernameVariable: 'USERNAME')]) {
                    echo USERNAME
                    dockerPush(USERNAME, PASSWORD)
                }
            }
        }
    }
}
