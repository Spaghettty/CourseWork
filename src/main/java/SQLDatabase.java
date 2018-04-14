import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLDatabase {
    private final String HOSTNAME = "";
    private final String USERNAME = "";
    private final String PASSWORD = "";
    private Connection connection;

    public SQLDatabase(){
        init();
    }

    private void init() {
        try {
            connection = DriverManager.getConnection(HOSTNAME, USERNAME, PASSWORD);
        } catch (SQLException sqlEx) {
            System.err.println("Unable to connect to the database: " + sqlEx.getMessage());
            System.err.println(sqlEx);
        }
    }

    public Connection getConnection() {
        return connection;
    }
}
