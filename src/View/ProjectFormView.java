package View;

import Model.Project;
import Model.ProjectManagement;
import Model.Tasks;
import Model.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProjectFormView extends JFrame {
    private DefaultListModel<Project> listProject;
    private DefaultComboBoxModel<User> listUser;
    private DefaultComboBoxModel<Tasks> listTask;
    private JFrame windowPrecedent;
    private JLabel flNproj;
    private JTextField tFnamePro;
    private JTextField tFDateDebut;
    private JTextField tFDateFin;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JButton validerButton;
    private JButton annulerButton;
    private JButton ajouterButton;
    private JButton supprimerButton;
    private JButton ajouterButton1;
    private JButton supprimerButton1;
    private JButton modifierButton;
    private JButton modifierButton1;
    private JPanel jpMain;

    public ProjectFormView (JFrame windowPrecedent){
        listProject = new DefaultListModel<>();
        listTask = new DefaultComboBoxModel<>();
        listUser = new DefaultComboBoxModel<>();
        comboBox1 = new JComboBox<>(listUser);
        comboBox2 = new JComboBox<>(listTask);

        getContentPane().add(jpMain);

        // Configurer la fenêtre
        this.windowPrecedent = windowPrecedent;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("GESTIONNAIRE DE PROJET AGILE");
        this.setMinimumSize(new Dimension(600, 400));
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        //this.add(jpMain);
        this.setVisible(true);
        annulerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                windowPrecedent.setVisible(true);
                dispose();
            }
        });
        ajouterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UserFormView newUser = new UserFormView(ProjectFormView.this);
                newUser.setVisible(true);
                setVisible(false);
            }
        });
        ajouterButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TaskFormView newTask = new TaskFormView(ProjectFormView.this);
                newTask.setVisible(true);
                setVisible(false);
            }
        });
        validerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nameProject = tFnamePro.getText();
                String dateDebut = tFDateDebut.getText();
                String dateFin = tFDateFin.getText();

                if (nameProject.isEmpty() || dateDebut.isEmpty() || dateFin.isEmpty()){
                    JOptionPane.showConfirmDialog(ProjectFormView.this,"S'il vous plait entrer toutes les informations","Essayer encore",JOptionPane.ERROR_MESSAGE);
                    return;
                }else {
                    ProjectManagement projectManagement = new ProjectManagement();
                    Project newProject = new Project(nameProject,dateDebut,dateFin);
                    projectManagement.addListProject(newProject);
                    System.out.println(projectManagement.addListProject(newProject));
                    tFnamePro.setText("");
                    tFDateDebut.setText("");
                    tFDateFin.setText("");
                    windowPrecedent.setVisible(true);
                    dispose();
                }

            }
        });
    }

}
