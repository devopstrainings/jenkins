def call() {
    pipeline {
      agent any
      stages {
        stage('Even Stage') {
          steps {
            echo "The build number is even"
            script { 
              thing = new prints()
              thing.warning 'Nothing to do!'
            }
          }
        }
      }
    }
}
