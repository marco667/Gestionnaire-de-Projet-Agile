package View;

import Model.Project;
import Model.Tasks;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TaskFormView extends JFrame {
    private DefaultListModel<Tasks> listTask;
    private JFrame windowPrecedent;
    private JButton validerButton;
    private JButton annulerButton;
    private JPanel mainPanel;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;

    public TaskFormView(JFrame windowPrecedent){
        listTask = new DefaultListModel<>();
        // Configurer la fenêtre
        this.windowPrecedent = windowPrecedent;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("GESTIONNAIRE DE PROJET AGILE");
        this.setMinimumSize(new Dimension(500, 300));
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.add(mainPanel);
        this.setVisible(true);
        annulerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                windowPrecedent.setVisible(true);
                dispose();
            }
        });
        validerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nomTask = textField1.getText();
                String description = textField2.getText();
                String status = textField3.getText();
                String dateDebut = textField4.getText();
                String dateFin = textField5.getText();

                if (nomTask.isEmpty() || description.isEmpty() || status.isEmpty() || dateDebut.isEmpty() || dateFin.isEmpty()){
                    JOptionPane.showConfirmDialog(TaskFormView.this,"S'il vous plait entrer toutes les informations","Essayer encore",JOptionPane.ERROR_MESSAGE);
                    return;
                }else {
                    Project newProject = new Project();
                    Tasks newTask = new Tasks(nomTask,description,status,dateDebut,dateFin);
                    newProject.addListTasks(newTask);
                    System.out.println(newProject.addListTasks(newTask));
                    textField1.setText("");
                    textField2.setText("");
                    textField3.setText("");
                    textField4.setText("");
                    textField5.setText("");
                    windowPrecedent.setVisible(true);
                    dispose();
                }

            }
        });
    }

}
