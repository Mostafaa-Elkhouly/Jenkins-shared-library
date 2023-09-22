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

    post {
        always {
            sh 'cur 44.199.207.179 > nginx-web-server' 
            archiveArtifacts 'nginx-web-server'
        }
    }
    
}
