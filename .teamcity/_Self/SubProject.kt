package _Self

import jetbrains.buildServer.configs.kotlin.Project

object SubProjectC : Project({
    name = "Project C"
    buildType(Build)
})