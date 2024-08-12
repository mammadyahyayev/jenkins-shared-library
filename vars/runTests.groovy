def call(boolean skipTests) {
    if (skipTests) {
        echo 'Tests are skipped...'
        return;
    }

    echo 'Executing tests...'
    sh './mvnw test'
}