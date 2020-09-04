pipeline {
    environment {
        JAVA_TOOL_OPTIONS = "-Duser.home=/home/jenkins"
    }
    agent {
        dockerfile {
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
