package _Self

import jetbrains.buildServer.configs.kotlin.Project

object CurrentProject : Project({
    subProject(SubProjectC)
})