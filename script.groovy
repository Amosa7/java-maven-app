def buildJar() {
    echo "building the application Jar..."
    sh "mvn package"
}

def buildImage() {
    echo "building docker image of the appliction docker Image..."
    withCredentials([usernamePassword(credentialsId: 'dockerhub-credentials', usernameVariable: 'USERNAME', passwordVariable: 'PASSWORD')]) {
        sh "docker build -t amosa77/demo-app:jma-2.42 ."
        sh "echo $PASSWORD | docker login -u $USERNAME --password-stdin"
        sh "docker push amosa77/demo-app:jma-2.42"
    }
}

def deployApp() {
    echo "deploying the application..."
}

return this
