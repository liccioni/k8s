pipeline {
  agent {
    kubernetes {
        label 'jenkins-slave'
        yaml """
apiVersion: "v1"
kind: "Pod"
metadata:
  annotations: {}
  labels:
    jenkins: "slave"
    jenkins/jenkins-slave: "true"
spec:
  containers:
  - env:
    - name: "JENKINS_AGENT_WORKDIR"
      value: "/home/jenkins/agent"
    image: "liccioni/my-slave-image:7.0"
    name: "jnlp"
    volumeMounts:
    - mountPath: "/home/jenkins/agent"
      name: "workspace-volume"
      readOnly: false
    - mountPath: "/var/run/docker.sock"
      name: "volume-0"
      readOnly: false
  hostNetwork: false
  nodeSelector:
    beta.kubernetes.io/os: "linux"
  restartPolicy: "Never"
  securityContext:
      privileged: true
  volumes:
  - hostPath:
      path: "/var/run/docker.sock"
    name: "volume-0"
  - emptyDir:
      medium: ""
    name: "workspace-volume"
"""
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
        script {
          try {
            sh './gradlew clean test --stacktrace --no-daemon' //run a gradle task
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