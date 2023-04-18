package Controller;

import Model.Project;
import Model.Tasks;
import Model.User;

import javax.swing.*;
import java.util.Date;
import java.util.List;

public class ProjectController {
    private Project modelProject;

    public ProjectController (Project modelProject){
        this.modelProject = modelProject;
    }

    public void setNameProject(String nameProject){
        modelProject.setNameProject(nameProject);
    }
    public String nameProject(){
        return modelProject.getNameProject();
    }

    public void setDebutProject(String debutProject){
        modelProject.setDateDebutProject(debutProject);
    }
    public String getDebutProject(){
        return modelProject.getDateDebutProject();
    }

    public void setFinProject(String finProject){
        modelProject.setDateFinProject(finProject);
    }
    public String getFinProject(){
        return modelProject.getDateFinProject();
    }

    public void setListUser(User user){
        modelProject.setUser(user);
    }
    public User getUser(){
        return modelProject.getUser();
    }

    public void setTasks(Tasks tasks){
        modelProject.setTasks(tasks);
    }
    public Tasks getTasks(){
        return modelProject.getTasks();
    }

    public void addUser(){

    }

    public void addTaskBacklogProducts(){

    }

    public void addTaskBacklogSprint(){

    }

    public void addPotentialUsablePartialProduct(){

    }

}
