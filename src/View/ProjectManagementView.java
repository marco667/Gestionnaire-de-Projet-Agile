package View;

import Controller.ProjectManagementController;
import Model.Project;
import Model.ProjectManagement;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

public class ProjectManagementView extends JFrame {

    DefaultListModel<Project> listModelProject = new DefaultListModel<>();
    private JPanel mainPanel;
    private JLabel flGP;
    private JButton buttonAddProj;
    private JButton buttonModifProj;
    private JButton buttonDeletProj;
    private JList<Project> list1;
    private JTextPane textPane1;

    public ProjectManagementView (){
        list1 = new JList<>(listModelProject);
        add(list1);

        getContentPane().add(mainPanel);
        //getContentPane().add(listProject, BorderLayout.NORTH);

        // Configurer la fenêtre
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("GESTIONNAIRE DE PROJET AGILE");
        this.setMinimumSize(new Dimension(700, 400));
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        //this.add(mainPanel);
        this.setVisible(true);
        buttonAddProj.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ProjectFormView newProjet = new ProjectFormView(ProjectManagementView.this);
                newProjet.setVisible(true);
                setVisible(false);
            }
        });

    }





}
