package _Self

import jetbrains.buildServer.configs.kotlin.BuildType
import jetbrains.buildServer.configs.kotlin.buildSteps.script

object Build : BuildType({
    name = "Test build"

    steps {
        script {
            name = "Do stuff"
            scriptContent = """
                sleep 30
            """.trimIndent()
        }
    }

})