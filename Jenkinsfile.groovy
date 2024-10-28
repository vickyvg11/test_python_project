@Library ('my_library') _
pipeline {
    agent any

    stages {
        stage("Git CheckOut") {
            steps {
                script {
                    def config = [
                        url : 'https://github.com/vickyvg11/test_python_project.git',
                        branchName: 'main',
                        credID: '1_Git'
                    ]
                    gitCheckout(config)
                }
            }
        }
    }
}
