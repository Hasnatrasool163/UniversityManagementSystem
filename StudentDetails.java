package university.management.system;
//
//import javax.swing.*;
//import javax.swing.table.DefaultTableModel;
//import javax.swing.table.AbstractTableModel;
//import java.awt.*;
//import java.sql.*;
////import net.proteanit.sql.DbUtils;
//import java.awt.event.*;
//import javax.swing.plaf.OptionPaneUI;
//import javax.swing.table.DefaultTableModel;
//import javax.swing.table.TableColumnModel;
//
//public class StudentDetails extends JFrame implements ActionListener {
//
//    Choice crollno;
//    JTable table;
//    JButton search, print, update, add, cancel;
//
//    StudentDetails() {
//
//        getContentPane().setBackground(Color.WHITE);
//        setLayout(null);
//        setResizable(false);
//        JLabel heading = new JLabel("Search by Roll Number");
//        heading.setBounds(20, 20, 150, 20);
//        add(heading);
//
//        crollno = new Choice();
//        crollno.setBounds(180, 20, 150, 20);
//        add(crollno);
//        String query ="select * from student";
//        try {
//            Conn c = new Conn();
//            ResultSet rs = c.s.executeQuery(query);
//            while(rs.next()) {
//                crollno.add(rs.getString("rollno"));
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        table = new JTable();
//
//        try {
//            Conn c = new Conn();
//            ResultSet rs = c.s.executeQuery("select * from student");
//            ResultSetMetaData metaData = rs.getMetaData();
//            int columnCount = metaData.getColumnCount();
//            String[] columnNames = new String[columnCount];
//            for (int i = 1; i <= columnCount; i++) {
//                columnNames[i - 1] = metaData.getColumnName(i);
//            }
//
//            DefaultTableModel model = new DefaultTableModel(columnNames, 0);
//
//            while (rs.next()) {
//                String[] rowData = new String[columnCount];
//                for (int i = 1; i <= columnCount; i++) {
//                    rowData[i - 1] = rs.getString(i); // Adjust getString for other data types
//                }
//                model.addRow(rowData);
//            }
//
////            table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
////            table.setRowMargin(5);
//            table.setBackground(Color.WHITE);
//            table.setForeground(Color.BLACK);
//            table.setGridColor(Color.lightGray);
//            table.setSelectionBackground(new Color(144230144));
//            table.setSelectionForeground(Color.BLACK);
//            table.setRowMargin(1);
//            table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
////            table.setGridColor(Color.darkGray);
////            table.setForeground(Color.BLACK);
//            table.setFont(new Font("TimesNewRoman",Font.BOLD,14));
////            table.setSelectionForeground(Color.MAGENTA);
////            table.setSelectionBackground(Color.lightGray);
//
//            table.setModel(model);
//
//
////            table.setModel(DbUtils.resultSetToTableModel(rs));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        JScrollPane jsp = new JScrollPane(table);
//        jsp.setBounds(0, 100, 1300, 600);
//        add(jsp);
//
//        search = new JButton("Search");
//        search.setBounds(20, 70, 80, 20);
//        search.addActionListener(this);
//        add(search);
//
//        print = new JButton("Print");
//        print.setBounds(120, 70, 80, 20);
//        print.addActionListener(this);
//        add(print);
//
//        add = new JButton("Add");
//        add.setBounds(220, 70, 80, 20);
//        add.addActionListener(this);
//        add(add);
//
//        update = new JButton("Update");
//        update.setBounds(320, 70, 80, 20);
//        update.addActionListener(this);
//        add(update);
//
//        cancel = new JButton("Cancel");
//        cancel.setBounds(420, 70, 80, 20);
//        cancel.addActionListener(this);
//        add(cancel);
//
//        setSize(1300, 700);
//        setLocation(330, 100);
//        setVisible(true);
//    }
//
//    public void actionPerformed(ActionEvent ae) {
//        if (ae.getSource() == search) {
//            String query = "select * from student where rollno = '"+crollno.getSelectedItem()+"'";
//            try {
//                Conn c = new Conn();
//                ResultSet rs = c.s.executeQuery(query);
//                ResultSetMetaData metaData = rs.getMetaData();
//                int columnCount = metaData.getColumnCount();
//                String[] columnNames = new String[columnCount];
//                for (int i = 1; i <= columnCount; i++) {
//                    columnNames[i - 1] = metaData.getColumnName(i);
//                }
//
//                DefaultTableModel model = new DefaultTableModel(columnNames, 0);
//
//                while (rs.next()) {
//                    String[] rowData = new String[columnCount];
//                    for (int i = 1; i <= columnCount; i++) {
//                        rowData[i - 1] = rs.getString(i); // Adjust getString for other data types
//                    }
//                    model.addRow(rowData);
//                }
//
//                table.setModel(model);
////                table.setModel(DbUtils.resultSetToTableModel(rs));
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        } else if (ae.getSource() == print) {
//            try {
//                table.print();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        } else if (ae.getSource() == add) {
//            setVisible(false);
//            new AddStudent();
//        } else if (ae.getSource() == update) {
//            setVisible(false);
//            new UpdateStudent();
//        } else {
//            setVisible(false);
//        }
//    }
//
//    public static void main(String[] args) {
//        new StudentDetails();
//    }
//}

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
import java.util.Vector;

public class StudentDetails extends JFrame implements ActionListener {

    Choice crollno;
    JTable table;
    JButton search, print, update, add, cancel;

    StudentDetails() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setResizable(false);

        JLabel heading = new JLabel("Search by Roll Number");
        heading.setBounds(20, 20, 150, 20);
        add(heading);

        crollno = new Choice();
        crollno.setBounds(180, 20, 150, 20);
        add(crollno);

        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from student");
            while(rs.next()) {
                crollno.add(rs.getString("rollno"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        table = new JTable();
        populateTable();

        JScrollPane jsp = new JScrollPane(table);
        jsp.setBounds(0, 100, 1300, 600);
        add(jsp);

        search = new JButton("Search");
        search.setBounds(20, 70, 80, 20);
        search.addActionListener(this);
        add(search);

        print = new JButton("Print");
        print.setBounds(120, 70, 80, 20);
        print.addActionListener(this);
        add(print);

        add = new JButton("Add");
        add.setBounds(220, 70, 80, 20);
        add.addActionListener(this);
        add(add);

        update = new JButton("Update");
        update.setBounds(320, 70, 80, 20);
        update.addActionListener(this);
        add(update);

        cancel = new JButton("Cancel");
        cancel.setBounds(420, 70, 80, 20);
        cancel.addActionListener(this);
        add(cancel);

        setSize(1300, 700);
        setLocation(330, 100);
        setVisible(true);
    }

    private void populateTable() {
        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from student");
            table.setModel(buildTableModel(rs));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static DefaultTableModel buildTableModel(ResultSet rs)
            throws SQLException {

        ResultSetMetaData metaData = rs.getMetaData();

        // names of columns
        Vector<String> columnNames = new Vector<String>();
        int columnCount = metaData.getColumnCount();
        for (int column = 1; column <= columnCount; column++) {
            columnNames.add(metaData.getColumnName(column));
        }

        // data of the table
        Vector<Vector<Object>> data = new Vector<Vector<Object>>();
        while (rs.next()) {
            Vector<Object> vector = new Vector<Object>();
            for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
                vector.add(rs.getObject(columnIndex));
            }
            data.add(vector);
        }

        return new DefaultTableModel(data, columnNames);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == search) {
            String query = "select * from student where rollno = '" + crollno.getSelectedItem() + "'";
            try {
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery(query);
                table.setModel(buildTableModel(rs));
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (ae.getSource() == print) {
            try {
                table.print();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (ae.getSource() == add) {
            setVisible(false);
            new AddStudent().setVisible(true);
        } else if (ae.getSource() == update) {
            String selectedRollNo = crollno.getSelectedItem();
            setVisible(false);
            new UpdateStudent().setVisible(true);
        } else {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new StudentDetails();
    }
}
