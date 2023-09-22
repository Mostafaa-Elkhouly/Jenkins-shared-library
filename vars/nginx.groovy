#!/usr/bin/env groovy
def call(String slaveNode = 'any') {
  
  pipeline {
   
    agent {
      label ${slaveNode}
    }

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
