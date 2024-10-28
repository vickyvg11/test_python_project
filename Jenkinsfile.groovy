@Library ('my_library') _
pipeline {
    agent any

    stages {
        stage("Git CheckOut") {
            steps {
                script {
                    def config = [
                        url : '',
                        branchName: '',
                        credID: ''
                    ]
                }
            }
        }
    }
}