package jp2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlConnection {
    public static Connection getConnection() throws SQLException{
        String dbURL ="jdbc:mysql://localhost:3306/book";
        String username="root";
        String password = "";
        Connection connection = DriverManager.getConnection(dbURL,username,password);
        if (connection != null){
            System.out.println("Ket noi thanh cong !");
        }
        return connection;

    }
}
