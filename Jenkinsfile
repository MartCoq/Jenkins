pipeline {
    agent any 
    stages {
        stage('Build') { 
            steps {
                sh "echo lol" 
            }
        }
        stage('Test') { 
            steps {
                sh "ls"
            }
        }
        stage('Deploy') { 
            steps {
                pwd
		sh "echo fin" 
            }
        }
    }
}
