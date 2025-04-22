package _Self

import jetbrains.buildServer.configs.kotlin.Project

object ProjectFromVCS : Project({
    name = "Project from VCS"
    buildType(Build)
})