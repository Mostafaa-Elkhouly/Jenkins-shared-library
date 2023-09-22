def call() {
  
  pipeline {
   
    agent any

    stages {
        stage('Update Macine') {
            steps {
                sh 'sudo apt update -y'
            }
        }
        
        stage('Install nginx') {
            steps {
                sh 'sudo apt install nginx -y'
            }
        }
    }
  }
}
