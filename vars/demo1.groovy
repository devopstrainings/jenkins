def call() {
    pipeline {
      agent any
      stages {
        stage('Odd Stage') {
          steps {
            echo "The Odd"
            script { 
              thing = new prints()
              thing.warning 'Nothing to do!'
            }
          }
        }
      }
    }
}
