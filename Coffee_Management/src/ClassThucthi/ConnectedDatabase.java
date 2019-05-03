package ClassThucthi;
import coffee.*;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConnectedDatabase {
     private static final String hostName="localhost";
    private static final String dbName="coffee";
    private static final String connectionUrl="jdbc:mysql://"+hostName+":3306/"+dbName+"?useUnicode=yes&characterEncoding=UTF-8";;
    private static final String username="root";
    private static final String pass=null;
    public static Connection getConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn= (Connection) DriverManager.getConnection(connectionUrl, username, pass);
            System.out.println("ket noi thanh cong");
            return conn;
        } catch (ClassNotFoundException ex) {
            System.out.println("Loi ket noi database");
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }
}
