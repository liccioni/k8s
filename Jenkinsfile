pipeline {
  agent {
    docker {
        image 'gradle/6.0.1-jdk8'
        label 'jenkins-slave'       
    }
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
    cron('H/2 * * * *')
  }
}
