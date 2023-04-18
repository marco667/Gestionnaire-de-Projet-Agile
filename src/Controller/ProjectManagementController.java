package Controller;

import Model.Project;
import Model.ProjectManagement;

import java.util.List;

public class ProjectManagementController {
    private ProjectManagement modelProjectManagement;

    public ProjectManagementController(ProjectManagement modelProjectManagement) {
        this.modelProjectManagement = modelProjectManagement;
    }

    public void setProject(Project project){
        modelProjectManagement.setProject(project);
    }

    public Project getProject(){
        return modelProjectManagement.getProject();
    }

    public void addProject(){

    }

    public void deleteProject(){

    }

    public void updateProject(){

    }

}
