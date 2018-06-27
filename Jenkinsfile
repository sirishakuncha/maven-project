pipeline {
  agent any
  stages{
    stage('Build') {
      bat "mvn clean package"
    }
    post {
      success {
        echo 'Now Archiving...'
        archiveArtifacts artifacts '**/target/*.war'
      }
    }
  }
}
