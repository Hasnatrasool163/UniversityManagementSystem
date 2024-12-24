package university.management.system;
import java.sql.*;

public class Conn {

        // for windows , mac-os users with mysql :
//    Connection c;
//    Statement s;

//    Conn () {
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            c = DriverManager.getConnection("jdbc:mysql:///test1", "root", "0328");
//            s = c.createStatement();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

    // for linux users with mariadb :

    private static final String URL = "jdbc:mariadb://localhost:3306/universitymanagementsystem";
    private static final String USER = "test_user";
    private static final String PASSWORD = "your_password";
    static Connection c;
    Statement s;

    public Conn(){
       try{
                c = DriverManager.getConnection(URL, USER, PASSWORD);
                s =c.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            } catch (SQLException e) {
                System.err.println("Connection failed: " + e.getMessage());
        }
    }
}
