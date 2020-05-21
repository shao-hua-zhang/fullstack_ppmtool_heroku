package io.shaohua.ppmtool.exceptions;

public class ProjectIdExceptionResponse { // handle the wrong id responce

    private String projectIdentifier;
    // 这个 Exception response 就是直接返回 project identifier
    public ProjectIdExceptionResponse(String projectIdentifier) {
        this.projectIdentifier = projectIdentifier;
    }

    public String getProjectIdentifier() {
        return projectIdentifier;
    }

    public void setProjectIdentifier(String projectIdentifier) {
        this.projectIdentifier = projectIdentifier;
    }
}
