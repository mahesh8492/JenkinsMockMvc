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
        stage('Build Docker Image') {
            steps {
                bat 'docker build -t mahesh8492/test .'
            }
        }
        stage('Push Docker Image to Docker Hub') {
            steps {
                bat 'docker login -u mahesh8492 -p Mahesh@F17-19@@'
                bat 'docker push mahesh8492/test'
            }
        }
    }
}
