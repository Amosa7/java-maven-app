def buildJAr() {
    echo "Building the application Jar..."
}

def testApp() {
    echo "Running tests..."
}

def deployApp() {
    echo "Deploying the application..."
    echo "Application version ${params.VERSION}"
}

return this
