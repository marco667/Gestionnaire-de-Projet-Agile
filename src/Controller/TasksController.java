package Controller;

import Model.Tasks;

import java.util.Date;

public class TasksController {

    private Tasks modelTasks;

    public TasksController(Tasks modelTasks) {
        this.modelTasks = modelTasks;
    }

    public void setNameTask(String nameTask){
        modelTasks.setName_task(nameTask);
    }
    public String getNameTask(){
        return modelTasks.getName_task();
    }

    public void setDescriptionTask(String descriptionTask){
        modelTasks.setDescription(descriptionTask);
    }
    public String getDescriptionTask(){
        return modelTasks.getDescription();
    }

    public void setStatusTask(String statusTask){
        modelTasks.setStatus(statusTask);
    }
    public String getStatusTask(){
        return modelTasks.getStatus();
    }

    public void setDateDebutTask(String dateDebutTask){
        modelTasks.setDateDebut(dateDebutTask);
    }
    public String getDateDebutTask(){
        return modelTasks.getDateDebut();
    }

    public void setDateFinTask(String dateFinTask){
        modelTasks.setDateFin(dateFinTask);
    }
    public String getDateFinTask(){
        return modelTasks.getDateFin();
    }

}
