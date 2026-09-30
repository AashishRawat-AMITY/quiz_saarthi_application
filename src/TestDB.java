import java.sql.Connection;
import java.sql.DriverManager;

public class TestDB {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/quiz_saarthi",
                "root",
                "As16081982#"
            );

            System.out.println("MySQL Connected!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
