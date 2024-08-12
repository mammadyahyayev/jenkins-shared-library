def call(skipTests) {
    if (skipTests) {
        echo 'Tests are skipped...'
    }

    echo 'Executing tests...'
    sh './mvnw test'
}