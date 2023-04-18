package Model;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class ProjectManagement {
    private Project project;
    private int idProjectManagement;

    DefaultListModel<Project> listModelProject = new DefaultListModel<>();

    public ProjectManagement() {
    }

    public ProjectManagement( Project project) {
        this.project = project;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public Project addListProject(Project project){
        listModelProject.addElement(project);
        return project;
    }

    public DefaultListModel<Project> getProjectList() {
        return listModelProject;
    }



}
