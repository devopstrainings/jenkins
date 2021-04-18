def call() {
    pipeline {
      agent any
      stages {
        stage('Even Stage') {
          steps {
            echo "The build number is even"
            script { 
              GroovyShell shell = new GroovyShell()
              def prints = shell.parse(new File('common/prints.groovy'))
              prints.info 'Starting'
              prints.warning 'Nothing to do!'
            }
          }
        }
      }
    }
}
