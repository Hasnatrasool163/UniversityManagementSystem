package university.management.system;
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//
//public class Project extends JFrame implements ActionListener {
//
//    Project() {
//        setSize(1540, 850);
//
//        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
//        Image i2 = i1.getImage().getScaledInstance(1500, 750, Image.SCALE_DEFAULT);
//        ImageIcon i3 = new ImageIcon(i2);
//        JLabel image = new JLabel(i3);
//        add(image);
//
//        JMenuBar mb = new JMenuBar();
//
//        // New Information
//        JMenu newInformation = new JMenu("New Information");
//        newInformation.setForeground(Color.BLUE);
//        mb.add(newInformation);
//
//        JMenuItem facultyInfo = new JMenuItem("New Faculty Information");
//        facultyInfo.setBackground(Color.WHITE);
//        facultyInfo.addActionListener(this);
//        newInformation.add(facultyInfo);
//
//        JMenuItem studentInfo = new JMenuItem("New Student Information");
//        studentInfo.setBackground(Color.WHITE);
//        studentInfo.addActionListener(this);
//        newInformation.add(studentInfo);
//
//        // Details
//        JMenu details = new JMenu("View Details");
//        details.setForeground(Color.RED);
//        mb.add(details);
//
//        JMenuItem facultydetails = new JMenuItem("View Faculty Details");
//        facultydetails.setBackground(Color.WHITE);
//        facultydetails.addActionListener(this);
//        details.add(facultydetails);
//
//        JMenuItem studentdetails = new JMenuItem("View Student Details");
//        studentdetails.setBackground(Color.WHITE);
//        studentdetails.addActionListener(this);
//        details.add(studentdetails);
//
//        // Leave
//        JMenu leave = new JMenu("Apply Leave");
//        leave.setForeground(Color.BLUE);
//        mb.add(leave);
//
//        JMenuItem facultyleave = new JMenuItem("Faculty Leave");
//        facultyleave.setBackground(Color.WHITE);
//        facultyleave.addActionListener(this);
//        leave.add(facultyleave);
//
//        JMenuItem studentleave = new JMenuItem("Student Leave");
//        studentleave.setBackground(Color.WHITE);
//        studentleave.addActionListener(this);
//        leave.add(studentleave);
//
//        // Leave Details
//        JMenu leaveDetails = new JMenu("Leave Details");
//        leaveDetails.setForeground(Color.RED);
//        mb.add(leaveDetails);
//
//        JMenuItem facultyleavedetails = new JMenuItem("Faculty Leave Details");
//        facultyleavedetails.setBackground(Color.WHITE);
//        facultyleavedetails.addActionListener(this);
//        leaveDetails.add(facultyleavedetails);
//
//        JMenuItem studentleavedetails = new JMenuItem("Student Leave Details");
//        studentleavedetails.setBackground(Color.WHITE);
//        studentleavedetails.addActionListener(this);
//        leaveDetails.add(studentleavedetails);
//
//        // Exams
//        JMenu exam = new JMenu("Examination");
//        exam.setForeground(Color.BLUE);
//        mb.add(exam);
//
//        JMenuItem examinationdetails = new JMenuItem("Examination Results");
//        examinationdetails.setBackground(Color.WHITE);
//        examinationdetails.addActionListener(this);
//        exam.add(examinationdetails);
//
//        JMenuItem entermarks = new JMenuItem("Enter Marks");
//        entermarks.setBackground(Color.WHITE);
//        entermarks.addActionListener(this);
//        exam.add(entermarks);
//
//        // UpdateInfo
//        JMenu updateInfo = new JMenu("Update Details");
//        updateInfo.setForeground(Color.RED);
//        mb.add(updateInfo);
//
//        JMenuItem updatefacultyinfo = new JMenuItem("Update Faculty Details");
//        updatefacultyinfo.setBackground(Color.WHITE);
//        updatefacultyinfo.addActionListener(this);
//        updateInfo.add(updatefacultyinfo);
//
//        JMenuItem updatestudentinfo = new JMenuItem("Update Student Details");
//        updatestudentinfo.setBackground(Color.WHITE);
//        updatestudentinfo.addActionListener(this);
//        updateInfo.add(updatestudentinfo);
//
//        // fee
//        JMenu fee = new JMenu("Fee Details");
//        fee.setForeground(Color.BLUE);
//        mb.add(fee);
//
//        JMenuItem feestructure = new JMenuItem("Fee Structure");
//        feestructure.setBackground(Color.WHITE);
//        feestructure.addActionListener(this);
//        fee.add(feestructure);
//
//        JMenuItem feeform = new JMenuItem("Student Fee Form");
//        feeform.setBackground(Color.WHITE);
//        feeform.addActionListener(this);
//        fee.add(feeform);
//
//        // Utility
//        JMenu utility = new JMenu("Utility");
//        utility.setForeground(Color.RED);
//        mb.add(utility);
//
//        JMenuItem notepad = new JMenuItem("Notepad");
//        notepad.setBackground(Color.WHITE);
//        notepad.addActionListener(this);
//        utility.add(notepad);
//
//        JMenuItem calc = new JMenuItem("Calculator");
//        calc.setBackground(Color.WHITE);
//        calc.addActionListener(this);
//        utility.add(calc);
//
//        // about
//        JMenu about = new JMenu("About");
//        about.setForeground(Color.BLUE);
//        mb.add(about);
//
//        JMenuItem ab = new JMenuItem("About");
//        ab.setBackground(Color.WHITE);
//        ab.addActionListener(this);
//        about.add(ab);
//
//        // exit
//        JMenu exit = new JMenu("Exit");
//        exit.setForeground(Color.RED);
//        mb.add(exit);
//
//        JMenuItem ex = new JMenuItem("Exit");
//        ex.setBackground(Color.WHITE);
//        ex.addActionListener(this);
//        exit.add(ex);
//
//        setJMenuBar(mb);
//
//        setVisible(true);
//    }
//
//    public void actionPerformed(ActionEvent ae) {
//        String msg = ae.getActionCommand();
//
//        if (msg.equals("Exit")) {
//            setVisible(false);
//        } else if (msg.equals("Calculator")) {
//            try {
//                Runtime.getRuntime().exec("calc.exe");
//            } catch (Exception e) {
//
//            }
//        } else if (msg.equals("Notepad")) {
//            try {
//                Runtime.getRuntime().exec("notepad.exe");
//            } catch (Exception e) {
//
//            }
//        } else if (msg.equals("New Faculty Information")) {
//            new AddTeacher();
//        } else if (msg.equals("New Student Information")) {
//            new AddStudent();
//        } else if (msg.equals("View Faculty Details")) {
//            new TeacherDetails();
//        } else if (msg.equals("View Student Details")) {
//            new StudentDetails();
//        } else if (msg.equals("Faculty Leave")) {
//            new TeacherLeave();
//        } else if (msg.equals("Student Leave")) {
//            new StudentLeave();
//        } else if (msg.equals("Faculty Leave Details")) {
//            new TeacherLeaveDetails();
//        } else if (msg.equals("Student Leave Details")) {
//            new StudentLeaveDetails();
//        } else if (msg.equals("Update Faculty Details")) {
//            new UpdateTeacher();
//        } else if (msg.equals("Update Student Details")) {
//            new UpdateStudent();
//        } else if (msg.equals("Enter Marks")) {
//            new EnterMarks();
//        } else if (msg.equals("Examination Results")) {
//            new ExaminationDetails();
//        } else if (msg.equals("Fee Structure")) {
//            new FeeStructure();
//        } else if (msg.equals("About")) {
//            new About();
//        } else if (msg.equals("Student Fee Form")) {
//            new StudentFeeForm();
//        }
//    }
//
//    public static void main(String[] args) {
//        new Project();
//    }
//}


// follow on projected completed on 5/4/2024
// time 4.33 pm
// day friday
// channel codeforinterview


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Project extends JFrame implements ActionListener {

    Project() {
        setSize(1540, 850);
        setLocation(150, 50);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/main3.jpg"));
//        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1540, 850, Image.SCALE_DEFAULT);
//        Image i2 = i1.getImage().getScaledInstance(1900, 950, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0, 0, 1366, 768);
        add(l1);

        // theme 3
//        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/main3.jpg"));
////        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
//        Image i2 = i1.getImage().getScaledInstance(1540, 850, Image.SCALE_DEFAULT);
////        Image i2 = i1.getImage().getScaledInstance(1900, 950, Image.SCALE_DEFAULT);
//        ImageIcon i3 = new ImageIcon(i2);
//        JLabel l1 = new JLabel(i3);
//        l1.setBounds(0, 0, 1366, 768);
//        add(l1);

        // theme 2
//        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/main2.jpg"));
////        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
//        Image i2 = i1.getImage().getScaledInstance(1540, 850, Image.SCALE_DEFAULT);
////        Image i2 = i1.getImage().getScaledInstance(1900, 950, Image.SCALE_DEFAULT);
//        ImageIcon i3 = new ImageIcon(i2);
//        JLabel l1 = new JLabel(i3);
//        l1.setBounds(0, 0, 1366, 768);
//        add(l1);

        JLabel l2 = new JLabel("University Management System");
        l2.setForeground(Color.BLACK);
        l2.setFont(new Font("serif", Font.BOLD, 30));
        l2.setBounds(480, 60, 1000, 80);
        l1.add(l2);

        JButton b1 = new JButton("Add Teacher");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(420, 220, 200, 40);
        b1.addActionListener(this);
        l1.add(b1);

        JButton b2 = new JButton("Add Student");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(720, 220, 200, 40);
        b2.addActionListener(this);
        l1.add(b2);

        JButton b3 = new JButton("Teacher Details");
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.setBounds(420, 270, 200, 40);
        b3.addActionListener(this);
        l1.add(b3);

        JButton b4 = new JButton("Student Details");
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);
        b4.setBounds(720, 270, 200, 40);
        b4.addActionListener(this);
        l1.add(b4);

        JButton b5 = new JButton("Update Teacher");
        b5.setBackground(Color.BLACK);
        b5.setForeground(Color.WHITE);
        b5.setBounds(420, 320, 200, 40);
        b5.addActionListener(this);
        l1.add(b5);

        JButton b6 = new JButton("Update Student");
        b6.setBackground(Color.BLACK);
        b6.setForeground(Color.WHITE);
        b6.setBounds(720, 320, 200, 40);
        b6.addActionListener(this);
        l1.add(b6);

        JButton b7 = new JButton("Fee Details");
        b7.setBackground(Color.BLACK);
        b7.setForeground(Color.WHITE);
        b7.setBounds(420, 370, 200, 40);
        b7.addActionListener(this);
        l1.add(b7);

        JButton b9 = new JButton("Enter Marks");
        b9.setBackground(Color.BLACK);
        b9.setForeground(Color.WHITE);
        b9.setBounds(720, 370, 200, 40);
        b9.addActionListener(this);
        l1.add(b9);

        JButton b10 = new JButton("Examination Results");
        b10.setBackground(Color.BLACK);
        b10.setForeground(Color.WHITE);
        b10.setBounds(420, 420, 200, 40);
        b10.addActionListener(this);
        l1.add(b10);

        JButton b11 = new JButton("Student Fee Form");
        b11.setBackground(Color.BLACK);
        b11.setForeground(Color.WHITE);
        b11.setBounds(720, 420, 200, 40);
        b11.addActionListener(this);
        l1.add(b11);

        JButton b8 = new JButton("Notepad");
        b8.setBackground(Color.BLACK);
        b8.setForeground(Color.WHITE);
        b8.setBounds(720, 470, 200, 40);
        b8.addActionListener(this);
        l1.add(b8);

        JButton b19 = new JButton("Calculator");
        b19.setBackground(Color.BLACK);
        b19.setForeground(Color.WHITE);
        b19.setBounds(420, 470, 200, 40);
        b19.addActionListener(this);
        l1.add(b19);

        JButton b101 = new JButton("About Us");
        b101.setBackground(Color.BLACK);
        b101.setForeground(Color.WHITE);
        b101.setBounds(570, 560, 200, 40);
        b101.addActionListener(this);
        l1.add(b101);

        getContentPane().setBackground(Color.WHITE);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        String msg = ae.getActionCommand();
        if (msg.equals("Add Teacher")) {
            new AddTeacher().setVisible(true);
        } else if (msg.equals("Add Student")) {
            new AddStudent().setVisible(true);
        } else if (msg.equals("Teacher Details")) {
            new TeacherDetails().setVisible(true);
        } else if (msg.equals("Student Details")) {
            new StudentDetails().setVisible(true);
        } else if (msg.equals("Update Teacher")) {
            new UpdateTeacher().setVisible(true);
        } else if (msg.equals("Update Student")) {
            new UpdateStudent().setVisible(true);
        } else if (msg.equals("Fee Details")) {
            new FeeStructure().setVisible(true);
        } else if (msg.equals("Enter Marks")) {
            new EnterMarks();
        } else if (msg.equals("Examination Results")) {
            new ExaminationDetails();
        } else if (msg.equals("Student Fee Form")) {
            new StudentFeeForm();
        }
        else if (msg.equals("Notepad")) {
            try {
                Runtime.getRuntime().exec("notepad.exe");
            } catch (Exception e) { }
        } else if (msg.equals("Calculator")) {
            try {
                Runtime.getRuntime().exec("calc.exe");
            } catch (Exception e) { }
        } else if (msg.equals("About Us")) {
            new About().setVisible(true);
        }
    }

    public static void main(String[] args) {
        new Project();
    }
}



