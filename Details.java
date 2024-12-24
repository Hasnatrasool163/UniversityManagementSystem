package university.management.system;
import javax.swing.*;
import java.sql.ResultSet;

public class Details extends JFrame {

    Details(){

        setLayout(null);
        setSize(600,600);
        setLocation(150,100);
        JLabel heading = new JLabel("Search with roll no");
        heading.setBounds(50,100,200,50);
        add(heading);
        setVisible(true);

        try{
            Conn con = new Conn();
            ResultSet rs = con.s.executeQuery("select * from student");
        }catch (Exception e){

        }
    }
    public static void main(String []agrs){

        new Details();
    }
}
