package Model;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Project {
    private int idProject;
    private String nameProject;
    private String dateDebutProject;
    private String dateFinProject;
    private User user;
    private Tasks tasks;
    private List<User> listUser = new ArrayList<>();
    private List<Tasks> listTasks = new ArrayList<>();


    public Project() {
    }
    public Project( String nameProject, String dateDebutProject, String dateFinProject) {
        this.nameProject = nameProject;
        this.dateDebutProject = dateDebutProject;
        this.dateFinProject = dateFinProject;
    }

    public String getNameProject() {
        return nameProject;
    }

    public void setNameProject(String nameProject) {
        this.nameProject = nameProject;
    }

    public String getDateDebutProject() {
        return dateDebutProject;
    }

    public void setDateDebutProject(String dateDebutProject) {
        this.dateDebutProject = dateDebutProject;
    }

    public String getDateFinProject() {
        return dateFinProject;
    }

    public void setDateFinProject(String dateFinProject) {
        this.dateFinProject = dateFinProject;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Tasks getTasks() {
        return tasks;
    }

    public void setTasks(Tasks tasks) {
        this.tasks = tasks;
    }

    public User addListUser (User user){
        listUser.add(user);
        return user;
    }

    public Tasks addListTasks (Tasks tasks){
        listTasks.add(tasks);
        return tasks;
    }

    public List<User> getListUser() {
        return listUser;
    }

    public List<Tasks> getListTasks() {
        return listTasks;
    }
}
