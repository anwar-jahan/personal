pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'echo "Hello World"'
                sh '''
                    echo "Multiline shell steps works too"
                    ls -lah
                '''
            }
        }
        stage('Test') {
            steps {
                sh 'echo "Start Testing"'
                sh '''
                    echo "end Testing"
                    ls -lah
                '''
            }
        }
        stage('Deploy') {
            steps {
               sh 'echo "Start Deploy"'
               sh '''
               echo "end Deploy"
               ls -lah
               '''
            }
        }
    }
}