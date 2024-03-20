
package responsitory;
import java.sql.*;

/**
 *
 * @author lenovo
 */
public class DBConnect {
    private static final String DATABASE = "DAM_2";
    private static final String USER = "sa";
    private static final String PASS = "12345";
    
    public static Connection getConnection() {
        String url = "jdbc:sqlserver://localhost:1433;databaseName=" + DATABASE + ";encrypt=true;trustservercertificate=true";
        try {
            return DriverManager.getConnection(url, USER, PASS);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
