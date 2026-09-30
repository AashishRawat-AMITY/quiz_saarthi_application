package Project;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class ConnectionProvider {

    public static Connection getCon() {
        Connection con = null;

        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create connection
            con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/quiz_saarthi_application?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true",
                "root",
                "As16081982#"
            );

            return con;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Database Connection Failed!\n" + e.getMessage());
            return null;
        }
    }
}
