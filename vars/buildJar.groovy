def call() {
    echo 'Building project...'
    sh './mvnw clean -Dmaven.test.skip=true package'
}