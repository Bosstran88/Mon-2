package database;
import java.sql.*;
import java.util.Scanner;

public class ConnectionEx {

    private static Connection getConnection()  throws SQLException{
            String dbURL = "jdbc:mysql://localhost:3306/dbtest";
            String username = "root";
            String password = "";
            Connection connection = DriverManager.getConnection(dbURL,username,password);
            return connection;
    }
    public static void addProduct() throws SQLException{
        Connection connection = getConnection();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name:");String name = scanner.next();
        System.out.println("Enter desc:");String proDesc = scanner.next();
        System.out.println("Enter price:");Double price = scanner.nextDouble();
        System.out.println("Enter ID:");int id = scanner.nextInt();
        String query = "insert into product values(?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1,id);
        preparedStatement.setString(2,name);
        preparedStatement.setString(3,proDesc);
        preparedStatement.setDouble(4,price);
        int rowInserted = preparedStatement.executeUpdate();
        if (rowInserted>0){
            System.out.println("Create thanh cong");
        }

    }
    public static void readProductData() throws SQLException{
        Connection conn = getConnection();
        String query="select * from product Order by name";
        Statement statement = conn.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        while (resultSet.next()){
            int id = resultSet.getInt(1);
            String name = resultSet.getString("name");
            String desc = resultSet.getString(3);
            double price = resultSet.getDouble("price");
            System.out.println(id + " "+ name+ " "+ desc+" "+ price);
        }
    }
    public static void editProduct() throws SQLException{
        Connection conn = getConnection();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name:");String name = scanner.next();
        System.out.println("Enter desc:");String proDesc = scanner.next();
        System.out.println("Enter price:");Double price = scanner.nextDouble();
        System.out.println("Enter ID:");int id = scanner.nextInt();

        String query = "UPDATE product set name =?, proDesc =?,price=? WHERE id = ?";
        PreparedStatement preparedStatement = conn.prepareStatement(query);
        preparedStatement.setString(1,name);
        preparedStatement.setString(2,proDesc);
        preparedStatement.setDouble(3,price);
        preparedStatement.setInt(4,id);
        int rowUpdated = preparedStatement.executeUpdate();
        if (rowUpdated>0){
            System.out.println("update complete");
        }
    }
    public static void deleteProduct() throws SQLException{
        Connection conn = getConnection();
        String query = "DELETE from product WHERE id =?";
        PreparedStatement preparedStatement = conn.prepareStatement(query);
        preparedStatement.setInt(1,4);
        int rowDeleted = preparedStatement.executeUpdate();
        if (rowDeleted>0){
            System.out.println("Complete");
        }
    }
    public static void searchById() throws SQLException{
        Connection conn = getConnection();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Id:");
        String query = "Select * from product where id = ?";
        int id1 = scanner.nextInt();
        PreparedStatement statement = conn.prepareStatement(query);
        statement.setInt(1,id1);
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()){
            int id = resultSet.getInt(1);
            String name = resultSet.getString("name");
            String desc = resultSet.getString("proDesc");
            double price = resultSet.getDouble("price");
            System.out.println(id + " "+ name+ " "+ desc+" "+ price);
        }
    }
    public static void searchByName() throws SQLException{
        Connection conn = getConnection();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Name:");
        String query = "Select * from product where name = ?";
        String id1 = scanner.next();
        PreparedStatement statement = conn.prepareStatement(query);
        statement.setString(1,id1);
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()){
            int id = resultSet.getInt(1);
            String name = resultSet.getString("name");
            String desc = resultSet.getString("proDesc");
            double price = resultSet.getDouble("price");
            System.out.println(id + " "+ name+ " "+ desc+" "+ price);
        }
    }
}
