pipeline {
    environment {
        JAVA_TOOL_OPTIONS = "-Duser.home=/home/jenkins"
    }
    agent {
        dockerfile {
            filename "Jenkins/Dockerfile"
            args "-v /tmp/maven:/home/jenkins/.m2 -e MAVEN_CONFIG=/home/jenkins/.m2"
        }
    }
    stages {
        stage("Build") {
            steps {
                sh "mvn -version"
                sh "mvn clean install"
            }
        }
        stage("deploy") {
            steps {
                sh "docker-compose build"
                sh "docker-compose up -d"
            }
        }
    }

    post {
        always {
            cleanWs()
        }
    }
}
