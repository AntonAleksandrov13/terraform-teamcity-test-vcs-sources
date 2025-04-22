package _Self

import jetbrains.buildServer.configs.kotlin.Project

object ProjectFromVCS : Project({
    buildType(Build)
})