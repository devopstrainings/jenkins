import prints
def call() {
    pipeline {
      agent any
      stages {
        stage('Even Stage') {
          steps {
            echo "The build number is even"
            script { 
              prints.info 'Starting'
              prints.warning 'Nothing to do!'
            }
          }
        }
      }
    }
}