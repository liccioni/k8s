pipeline {
  agent any {
//     docker {
//       image 'gradle/6.0.1-jdk8'
      label 'jenkins-slave'
//     }

  }
  stages {
    stage('Build') {
      steps {
        echo 'Building..'
      }
    }

    stage('Test') {
      steps {
        script {
          try {
            sh './gradlew clean test --no-daemon' //run a gradle task
          } finally {
            junit '**/build/test-results/test/*.xml' //make the junit test results available in any case (success & failure)
          }
        }

      }
    }

    stage('Deploy') {
      steps {
        echo 'Deploying!!!....'
      }
    }

  }
  triggers {
    cron('H */8 * * *')
    pollSCM('* * * * *')
  }
}