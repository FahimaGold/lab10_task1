
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DatabaseConnection {
       // the database instance
        private static DatabaseConnection instance;
        private Connection connection;
        private String url = "jdbc:mysql://localhost:3306/jdbc";
        private String username = "root";
        private String password = "somePassword";
        // handling connection exception
        private DatabaseConnection() throws SQLException {
            try {
                Class.forName("org.mysql.Driver");
                this.connection = DriverManager.getConnection(url, username, password);
            } catch (ClassNotFoundException ex) {
                System.out.println("Something is wrong with the DB connection String : " + ex.getMessage());
            }
        }
        public Connection getConnection() {
            return connection;
        }

        // complete this code here


    }

