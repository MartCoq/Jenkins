pipeline {
    agent { node { label 'MI6' } }
    stages {
        stage('Build') { 
            steps {
                sh 'mvn clean install' 
            }
        }
        stage('Test') { 
            steps {
                sh 'echo test'
            }
        }
	stage('Post Build'){
	    steps {
		archiveArtifacts artifacts: '*/*.war', followSymlinks: false
	    }
	}
        stage('Deploy') { 
            steps {
                deploy adapters: [tomcat9(credentialsId: 'be484bd1-5669-4fcd-b29d-4c41588d7934', path: '', url: 'http://172.17.0.5:8080/')], contextPath: '/spark', war: '*/*.war'
            }
        }
    }
}
