package DesktopGUI;

import Controller.DesktopClientController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.*;

public class AuthenticationPanel
{

    JLabel imageLabel;
    JPanel picturePanel;

    JPanel AuthenticationPanel;
    JPanel GridAuthentication;
    JButton AuthenticationLogin;
    JButton AuthenticationCancel;

    JLabel usernameLabel;
    JLabel passwordLabel;

    JTextField username;
    JTextField password;



    public AuthenticationPanel()
    {
        GridLayout layout = new GridLayout(2,1,100,0);
        GridAuthentication = new JPanel();

        AuthenticationPanel = new JPanel();
        AuthenticationPanel.setSize(350,350);
        AuthenticationPanel.setLayout(null);
        AuthenticationPanel.setBackground(Color.WHITE);

        AuthenticationPanel.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 2));
        createAuthenticationButtons();
        createTextFields();
        createJLabels();
        createPicturePanel();

        AuthenticationPanel.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 2));


        GridAuthentication.setLayout(layout);
        GridAuthentication.add(picturePanel);
        GridAuthentication.add(AuthenticationPanel);

    }

    public void createPicturePanel()
    {
        ImageIcon image = new ImageIcon("Images/pi_logo.png");

        imageLabel = new JLabel("", image, JLabel.CENTER);
        picturePanel = new JPanel(new BorderLayout());
        picturePanel.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 2));
        picturePanel.setBackground(Color.WHITE);
        picturePanel.add( imageLabel, BorderLayout.CENTER );
    }


    public JPanel getAuthenticationPanel()
    {
        return GridAuthentication;

    }

    public void createTextFields()
    {
        username = new JTextField();
        username.setBounds(100,25,150,30);
        AuthenticationPanel.add(username);

        password = new JTextField();
        password.setBounds(100,75,150,30);
        AuthenticationPanel.add(password);

    }

    public void createJLabels()
    {
        usernameLabel = new JLabel("Username:");
        usernameLabel.setBounds(100,5,150,20);
        usernameLabel.setVisible(true);

        passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(100,55,150,20);
        passwordLabel.setVisible(true);

        AuthenticationPanel.add(usernameLabel);
        AuthenticationPanel.add(passwordLabel);
    }

    public void createAuthenticationButtons()
    {
        AuthenticationLogin = new JButton("Login");
        AuthenticationLogin.setBounds(50,150,100,30);
        AuthenticationLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(DesktopClientController.isValidUser()){
                    DesktopClientController.replacePanel(new DeviceControlPanel().getPanel());
                }
                else
                    System.out.println("Username or Password are incorrect");
            }
        });



        AuthenticationCancel= new JButton("Close");
        AuthenticationCancel.setBounds(200,150,100,30);
        AuthenticationCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        AuthenticationPanel.add(AuthenticationLogin);
        AuthenticationPanel.add(AuthenticationCancel);

    }

}
