pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                echo 'Checking Out'
            }
        }
         stage('Package') {
            steps {
                bat 'mvn clean package'
            }
        }
        stage('Sonar Analytics') {
            steps {
                withSonarQubeEnv('ZensarCodeAnalysis')
                {
                    bat 'mvn sonar:sonar'
                }
            }
        }
        stage('JaCoCo Report') {
            steps {
                jacoco()
            }
        }
    }
}
