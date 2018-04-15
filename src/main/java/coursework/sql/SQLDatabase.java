package coursework.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLDatabase {
    private final String HOSTNAME = "jdbc:mysql://sql2.freesqldatabase.com:3306/sql2232670";
    private final String USERNAME = "sql2232670";
    private final String PASSWORD = "yT3%nE3!";
    private Connection connection;

    public SQLDatabase(){
        init();
    }

    private void init() {
        // Load the MySQL Driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException c) {
            System.err.println("Error loading MySQL Driver");
            c.printStackTrace();
        }

        // Connect to the database
        try {
            connection = DriverManager.getConnection(HOSTNAME, USERNAME, PASSWORD);
        } catch (SQLException sqlEx) {
            System.err.println("Unable to connect to the database: " + sqlEx.getMessage());
            sqlEx.printStackTrace();
        }
        
        
    }

    /**
     * Return the database connection
     * @return {@link Connection} - The database connection
     */
    public Connection getConnection() {
        return connection;
    }
}
