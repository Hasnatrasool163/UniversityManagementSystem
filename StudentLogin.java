package university.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class StudentLogin extends JFrame implements ActionListener {
    JTextField rollnoField, emailField;
    JButton login, back;

    StudentLogin() {
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        JLabel rollnoLabel = new JLabel("Roll Number");
        rollnoLabel.setBounds(40, 20, 100, 30);
        add(rollnoLabel);

        rollnoField = new JTextField();
        rollnoField.setBounds(150, 20, 150, 30);
        add(rollnoField);

        JLabel emailLabel = new JLabel("Email");
        emailLabel.setBounds(40, 70, 100, 30);
        add(emailLabel);

        emailField = new JTextField();
        emailField.setBounds(150, 70, 150, 30);
        add(emailField);

        login = new JButton("Login");
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.setBounds(40, 140, 120, 30);
        login.addActionListener(this);
        add(login);

        back = new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(180, 140, 120, 30);
        back.addActionListener(this);
        add(back);

        setSize(600, 300);
        setLocation(400, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == login) {
            String rollno = rollnoField.getText();
            String email = emailField.getText();
            String query = "select * from student where rollno = '" + rollno + "' and email = '" + email + "'";
            try {
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery(query);
                if (rs.next()) {
                    new StudentDetails().setVisible(true);
                    this.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid Login");
                    rollnoField.setText("");
                    emailField.setText("");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (ae.getSource() == back) {
            new Project().setVisible(true);
            this.setVisible(false);
        }
    }

    public static void main(String[] args) {
        new StudentLogin();
    }
}
