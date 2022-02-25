package com.github.renevanderark.myfirstideaplugin.services

import com.intellij.openapi.project.Project
import com.github.renevanderark.myfirstideaplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
