package Database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionManager {

    private Connection conn;

    private static DatabaseConnectionManager connectionInstance = new DatabaseConnectionManager();



    public DatabaseConnectionManager getManagerInstance(){

        return connectionInstance;
        
    }

    public void connect() throws SQLException{
        //TODO
        conn = DriverManager.getConnection("Some/Database/URL");
        System.out.println("Established Database Connection...");
    }

    public Connection getConnectionObject(){
        //TODO
        return conn;
    }

    public void disconnect(){
        //TODO
        System.out.println("Disconnected");
    }
}
