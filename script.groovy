def buildJAr() {
    echo "Building the application Jar..."
    echo "Building the application in branch..."
}

def testApp() {
    echo "Running tests..."
}

def deployApp() {
    echo "Deploying the application..."
    echo "Application version ${params.VERSION}"
}

return this
