pipeline {
    agent any

    stages {
        stage("Build") {
            steps {
                sh "mvn -version"
                sh "mvn clean install"
            }
        }
        stage("dockerBuild") {
            steps {
                sh "docker build -t springbootapp ."
            }
        }
        stage("dockerRun") {
            steps {
                sh "docker run -t springbootapp"
            }
        }
    }

    post {
        always {
            cleanWs()
        }
    }
}
