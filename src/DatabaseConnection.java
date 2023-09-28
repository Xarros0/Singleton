import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static DatabaseConnection INSTANCE = null;
    private Connection connection;

    private DatabaseConnection() {
        // Yksityinen konstruktori estää luokan luomisen ulkopuolelta.
        // Voit täällä luoda tietokantayhteyden.
        try {
            String url = "jdbc:mysql://localhost:3306/mydatabase";
            String username = "username";
            String password = "password";
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static DatabaseConnection getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new DatabaseConnection();
        }
        return INSTANCE;
    }

    public Connection getConnection() {
        return connection;
    }
}
