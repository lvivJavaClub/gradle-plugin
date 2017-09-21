package com.lohika.javaclub;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class FirstPlugin implements Plugin<Project> {

    @Override
    public void apply(Project project) {
        System.out.printf("The name of the project, plugin applied to is: %s \n", project.getName());

//        Tasks for next meeting
        //TODO add git repository service for reading avg of git user and stat

        //TODO add configuration of output (1.file 2.console)

        //TODO add dependent tasks

        //TODO inject commiters txt file into artifact jar

    }
}
