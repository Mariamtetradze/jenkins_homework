pipeline {
  agent any
  stages {
    stage('mvn version') {
      parallel {
        stage('mvn version') {
          steps {
            sh 'mvn --version'
          }
        }

        stage('Build with Maven') {
          steps {
            sh 'mvn compile test package'
          }
        }

      }
    }

  }
}