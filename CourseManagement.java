package university.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class CourseManagement extends JFrame implements ActionListener {
    JTextField courseName, courseId, courseFee, courseDuration, studentId;
    JButton addCourse, updateCourse, registerCourse;

    CourseManagement() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading = new JLabel("Course Management");
        heading.setFont(new Font("Tahoma", Font.BOLD, 24));
        heading.setBounds(120, 30, 300, 30);
        add(heading);

        JLabel l0 = new JLabel("Student ID:");
        l0.setBounds(50, 70, 100, 30);
        add(l0);

        studentId = new JTextField();
        studentId.setBounds(200, 70, 150, 30);
        add(studentId);

        JLabel l1 = new JLabel("Course ID:");
        l1.setBounds(50, 110, 100, 30);
        add(l1);

        courseId = new JTextField();
        courseId.setBounds(200, 110, 150, 30);
        add(courseId);

        JLabel l2 = new JLabel("Name:");
        l2.setBounds(50, 150, 100, 30);
        add(l2);

        courseName = new JTextField();
        courseName.setBounds(200, 150, 150, 30);
        add(courseName);

        JLabel l3 = new JLabel("Fee:");
        l3.setBounds(50, 190, 100, 30);
        add(l3);

        courseFee = new JTextField();
        courseFee.setBounds(200, 190, 150, 30);
        add(courseFee);

        JLabel l4 = new JLabel("Duration:");
        l4.setBounds(50, 230, 100, 30);
        add(l4);

        courseDuration = new JTextField();
        courseDuration.setBounds(200, 230, 150, 30);
        add(courseDuration);

        addCourse = new JButton("Add Course");
        addCourse.setBounds(20, 280, 130, 30);
        addCourse.addActionListener(this);
        add(addCourse);

        updateCourse = new JButton("Update Course");
        updateCourse.setBounds(160, 280, 130, 30);
        updateCourse.addActionListener(this);
        add(updateCourse);

        registerCourse = new JButton("Register Course");
        registerCourse.setBounds(300, 280, 130, 30);
        registerCourse.addActionListener(this);
        add(registerCourse);

        setSize(500, 350);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == addCourse) {
            String id = courseId.getText();
            String name = courseName.getText();
            String fee = courseFee.getText();
            String duration = courseDuration.getText();
            try {
                Conn con = new Conn();
                String query = "INSERT INTO courses (course_id, name, fee, duration) VALUES (?, ?, ?, ?)";
                PreparedStatement ps = con.c.prepareStatement(query);
                ps.setString(1, id);
                ps.setString(2, name);
                ps.setString(3, fee);
                ps.setString(4, duration);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Course Added Successfully");
                clearFields();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        } else if (ae.getSource() == updateCourse) {
            String id = courseId.getText();
            String name = courseName.getText();
            String fee = courseFee.getText();
            String duration = courseDuration.getText();
            try {
                Conn con = new Conn();
                String query = "UPDATE courses SET name = ?, fee = ?, duration = ? WHERE course_id = ?";
                PreparedStatement ps = con.c.prepareStatement(query);
                ps.setString(1, name);
                ps.setString(2, fee);
                ps.setString(3, duration);
                ps.setString(4, id);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Course Updated Successfully");
                clearFields();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        } else if (ae.getSource() == registerCourse) {
            String sId = studentId.getText();
            String cId = courseId.getText();
            try {
                Conn con = new Conn();
                String query = "INSERT INTO course_student (student_id, course_id) VALUES (?, ?)";
                PreparedStatement ps = con.c.prepareStatement(query);
                ps.setString(1, sId);
                ps.setString(2, cId);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Course Registered Successfully");
                clearFields();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }

    private void clearFields() {
        studentId.setText("");
        courseId.setText("");
        courseName.setText("");
        courseFee.setText("");
        courseDuration.setText("");
    }

    public static void main(String[] args) {
        new CourseManagement();
    }
}
