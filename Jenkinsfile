pipeline {
  agent {
    label 'jenkins-slave'
  }
  stages {
    stage('Build') {
      steps {
        echo 'Building..'
      }
    }

    stage('Test') {
      steps {
        echo 'Testing..'
      }
    }

    stage('Deploy') {
      steps {
        echo 'Deploying!....'
      }
    }

  }
  triggers {
    cron('H/30 * * * *')
  }
}
