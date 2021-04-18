import common/prints.groovy
def call() {
    pipeline {
      agent any
      stages {
        stage('Even Stage') {
          steps {
            echo "The build number is even"
            script { 
              info 'Starting'
              warning 'Nothing to do!'
            }
          }
        }
      }
    }
}
