pipeline {
    agent any 
    stages {
        stage('Build') { 
            steps {
                echo 'Building3...'
                bat 'mvn clean package'
                archiveArtifacts artifacts: '**/target/*.jar'
            }
        }
        stage('Test') { 
            steps {
                echo 'Testing...'
                bat 'mvn test -B'
            }
        }
        stage('Deploy') { 
            steps {
                echo 'Deploying...'
            }
        }
    }
}