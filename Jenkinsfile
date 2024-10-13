pipeline {
    agent any

    tools {
        maven 'maven3.9.9' // 确保 Maven 安装在 Jenkins 中，并且配置好工具名
        jdk 'openjdk'         // 确保 JDK 安装在 Jenkins 中，并配置好工具名
    }

    stages {
        stage('Checkout') {
            steps {
                // 从 SCM (如 Git) 检出代码
                checkout scm
            }
        }

        stage('Build & Test') {
            steps {
                // 使用 Maven 进行构建和测试
                sh 'mvn clean verify'
            }
        }

        stage('Publish Test Results') {
            steps {
                // 使用 Jenkins 的 JUnit 插件来发布测试结果
                junit '**/target/surefire-reports/*.xml'
            }
        }
    }

    post {
        always {
            // 无论构建成功与否，都会进行以下步骤
            archiveArtifacts artifacts: '**/target/*.jar', allowEmptyArchive: true
        }

        success {
            // 当构建成功时触发
            echo 'Build and tests successful!'
        }

        failure {
            // 当构建失败时触发
            echo 'Build or tests failed!'
        }
    }
}
