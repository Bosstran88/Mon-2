package program.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConnectionMysql {
    public static void main(String[] args) throws SQLException {
        getConnection();
    }
    public static Connection getConnection() throws SQLException{
        String dbURL = "jdbc:mysql://localhost:3306/dbtest";
        String username = "root";
        String password = "";
        Connection connection = DriverManager.getConnection(dbURL,username,password);
        if (connection != null){
            System.out.println("ket noi thanh cong");
        }
        return connection;

    }
}
