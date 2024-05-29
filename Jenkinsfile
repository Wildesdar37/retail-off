pipeline {
    agent any

    tools {
        // Instalar Maven desde las herramientas globales de Jenkins
        maven "Maven 3.6.3"
        jdk "jdk-11"
    }

    stages {
        stage('Checkout') {
            steps {
                // Clonar el código fuente desde el repositorio
                git url: 'https://github.com/Wildesdar37/retail-off.git', branch: 'main'
            }
        }

        stage('Build') {
            steps {
                // Limpiar y construir el proyecto Maven
                sh 'mvn clean package'
            }
        }

        stage('Test') {
            steps {
                // Ejecutar los tests del proyecto Maven
                sh 'mvn test'
            }
        }

        stage('Archive Artifacts') {
            steps {
                // Archivar los artefactos de construcción y resultados de pruebas
                archiveArtifacts artifacts: '**/target/*.jar', allowEmptyArchive: true
                junit '**/target/surefire-reports/*.xml'
            }
        }
    }

    post {
        success {
            echo 'Build and tests were successful!'
        }
        failure {
            echo 'Build or tests failed.'
        }
    }
}
