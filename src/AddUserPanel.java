import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.event.*;

public class AddUserPanel extends JFrame {

    JButton addUserButton;
    JTextField usernameField;
    JPasswordField passwordField;

    JLabel userTypeLabel;

    JLabel usernameLabel;

    JLabel passwordLabel;
    ButtonGroup userTypeButtons;
    JRadioButton playerUserTypeRB;
    JRadioButton quizCreatorUserTypeRB;

    public AddUserPanel() {
        // Create new panel
        JPanel centerPanel = new JPanel();
        setSize(375, 300);

        addUserButton = new JButton("Create User");
        addUserButton.addActionListener(new addButtonHandler());
        usernameLabel = new JLabel("Username: ");
        passwordLabel = new JLabel("Password: ");
        usernameField = new JTextField(25);
        passwordField = new JPasswordField(30);
        userTypeLabel = new JLabel("User Type: ");
        userTypeButtons = new ButtonGroup();
        playerUserTypeRB = new JRadioButton("Player");
        quizCreatorUserTypeRB = new JRadioButton("Quiz Creator");
        userTypeButtons.add(playerUserTypeRB);
        userTypeButtons.add(quizCreatorUserTypeRB);


        centerPanel.add(usernameLabel);
        centerPanel.add(usernameField);
        centerPanel.add(passwordLabel);
        centerPanel.add(passwordField);
        centerPanel.add(userTypeLabel);
        centerPanel.add(userTypeLabel);
        centerPanel.add(playerUserTypeRB);
        centerPanel.add(quizCreatorUserTypeRB);
        centerPanel.add(addUserButton);


        add(centerPanel, BorderLayout.CENTER);

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);


    }

    // Creates user by taking input from panel
    public void addUser(){
        User u = new User();

        u.setUsername(usernameField.getText());
        // temp password
        u.setPassword("password1");

        if(playerUserTypeRB.isSelected()){
            u.setType(User.userType.PLAYER);
        } else if (quizCreatorUserTypeRB.isSelected()) {
            u.setType(User.userType.QUIZCREATOR);
        }

        User.userArray.add(u);
        System.out.println(u.username);
        JOptionPane.showMessageDialog(null, String.format("User %s has been created successfully.", u.getUsername()));
    }
    private class addButtonHandler implements ActionListener {

        public void actionPerformed(ActionEvent addEvent){
            addUser();
        }
    }
}
