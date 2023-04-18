package Model;

import java.util.Date;

public class Tasks {

    private int id_task;
    private String name_task;
    private String description;
    private String status;
    private String dateDebut;
    private String dateFin;

    public Tasks() {
    }
    public Tasks(String name_task, String status, String description, String dateDebut, String dateFin) {
        this.description = description;
        this.status = status;
        this.name_task = name_task;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
    }

    public String getName_task() {
        return name_task;
    }

    public void setName_task(String name_task) { this.name_task = name_task; }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }

    public String getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(String dateDebut) {
        this.dateDebut = dateDebut;
    }

    public String getDateFin() {
        return dateFin;
    }

    public void setDateFin(String dateFin) {
        this.dateFin = dateFin;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
