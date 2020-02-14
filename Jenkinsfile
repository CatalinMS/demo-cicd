pipeline {
    agent any
    options {
        skipStagesAfterUnstable()
    }
    stages {
        stage('Build') {
            steps {
                echo 'Hello World'
                sh 'echo "hello pipeline"'
            }
        }
    }
}
