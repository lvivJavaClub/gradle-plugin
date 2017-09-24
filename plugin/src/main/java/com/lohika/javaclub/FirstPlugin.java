package com.lohika.javaclub;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class FirstPlugin implements Plugin<Project> {

    // TODO add git repository service for reading avg of git user and stat
    private GitService gitService = new GitServiceImpl();

    @Override
    public void apply(Project project) {

        System.out.printf("The name of the project, plugin applied to is: %s \n", project.getName());

//        Tasks for next meeting

        // TODO add configuration of output (1.file 2.console)
        /*
        if ("configuration contains "file") {
            gitService.registerWriter(new FileStatWriter(fileName));
        }
        if (configuration contains "console") {
            gitService.registerWriter(new ConsoleStatWriter());
        }
        if (configuration contains "rest") {
            gitService.registerWriter(new RestStatWriter());
        }
         */

        // TODO add dependent tasks

        // TODO inject commiters txt file into artifact jar

    }
}
