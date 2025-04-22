package _Self

import jetbrains.buildServer.configs.kotlin.BuildType
import jetbrains.buildServer.configs.kotlin.buildSteps.script

object Build : BuildType({
    name = "Test build"

    steps {
        script {
            name = "Sleep 30"
            scriptContent = """
                set -euxo pipefail
                sleep 30
            """.trimIndent()
        }
    }

})