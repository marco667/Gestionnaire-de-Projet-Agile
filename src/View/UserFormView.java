package View;

import Model.Project;
import Model.User;

import javax.swing.*;
import javax.swing.text.Document;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserFormView extends JFrame {
    private DefaultListModel<User> listUser;
    private JPanel mainPanel;
    private JFrame windowPrecedent;
    private JTextField textFieldPrenom;
    private JTextField textFieldNom;
    private JTextField textFieldEmail;
    private JTextField textFieldRole;
    private JLabel flPrenom;
    private JLabel flNom;
    private JLabel flEmail;
    private JLabel flRole;
    private JButton validerButton;
    private JButton annulerButton;

    public UserFormView( JFrame windowPrecedent){
        listUser = new DefaultListModel<>();

        // Configurer la fenêtre
        this.windowPrecedent = windowPrecedent;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("GESTIONNAIRE DE PROJET AGILE");
        this.setMinimumSize(new Dimension(300, 300));
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
                String prenom = textFieldPrenom.getText();
                String nom = textFieldNom.getText();
                String email = textFieldEmail.getText();
                String role = textFieldRole.getText();

                if (prenom.isEmpty() || nom.isEmpty() || email.isEmpty() || role.isEmpty()){
                    JOptionPane.showConfirmDialog(UserFormView.this,"S'il vous plait entrer toutes les informations","Essayer encore",JOptionPane.ERROR_MESSAGE);
                    return;
                }else{
                    Project project = new Project();
                    User newUser = new User(prenom,nom,email,role);
                    project.addListUser(newUser);
                    System.out.println(project.addListUser(newUser));
                    textFieldPrenom.setText("");
                    textFieldNom.setText("");
                    textFieldEmail.setText("");
                    textFieldRole.setText("");
                    windowPrecedent.setVisible(true);
                    dispose();
                }


            }
        });
    }



}
