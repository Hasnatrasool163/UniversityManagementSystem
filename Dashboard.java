package university.management.system;
import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class Dashboard extends JFrame {
    private JLabel studentsLabel, facultyLabel, coursesLabel, eventsLabel;

    Dashboard() {
        setLayout(new GridLayout(4, 2, 10, 10)); // Simple grid layout for demonstration

        // Initialize JLabels
        studentsLabel = new JLabel("Total Students: ");
        facultyLabel = new JLabel("Total Faculty Members: ");
        coursesLabel = new JLabel("Courses Offered: ");
        eventsLabel = new JLabel("Upcoming Events: ");

        // Fetch and display the stats
        fetchAndDisplayStats();

        // Adding components to JFrame
        add(studentsLabel);
        add(facultyLabel);
        add(coursesLabel);
        add(eventsLabel);

        // JFrame basic setup
        setTitle("University Dashboard");
        setSize(400, 200);
        setLocationRelativeTo(null); // Center on screen
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void fetchAndDisplayStats() {
        Conn conn = new Conn();
        try {
            // Students Count
            ResultSet rs = conn.s.executeQuery("SELECT COUNT(*) AS count FROM student");
            if (rs.next()) {
                studentsLabel.setText(studentsLabel.getText() + rs.getInt("count"));
            }

            // Faculty Count
            rs = conn.s.executeQuery("SELECT COUNT(*) AS count FROM teacher");
            if (rs.next()) {
                facultyLabel.setText(facultyLabel.getText() + rs.getInt("count"));
            }

            // Courses Count
//            rs = conn.s.executeQuery("SELECT COUNT(*) AS count FROM courses");
//            if (rs.next()) {
//                coursesLabel.setText(coursesLabel.getText() + rs.getInt("count"));
//            }
//
//            // Events Count
//            rs = conn.s.executeQuery("SELECT COUNT(*) AS count FROM events");
//            if (rs.next()) {
//                eventsLabel.setText(eventsLabel.getText() + rs.getInt("count"));
//            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Database error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        new Dashboard();
    }
}
