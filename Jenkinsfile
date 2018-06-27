pipeline {
  agent any
  stages{
    stage('Build') {
      mvn clean package
    }
    post {
      success {
        echo 'Now Archiving...'
        archiveArtifacts artifacts '**/targer/*.war'
      }
    }
  }
}
