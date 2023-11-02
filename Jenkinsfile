pipeline {
    agent any
    stages {
        stage("testing") {
            steps {
                script {
                    echo "Testing the application ..."
                    echo "Testing application branch $BRANCH_NAME"
                }
            }
        }
        stage("buildJAr") {
          when {
            expression {
              BRANCH_NAME == "master"
            }
          }
            steps {
                script {
                    echo "Building the application JAr..."
                }
            }
        }
        stage("deployApp") {
          when {
            expression {
              BRANCH_NAME == "master"
            }
          }
            steps {
                script {
                    echo "Deploying the application..."
                }
            }
        }
    }
}
