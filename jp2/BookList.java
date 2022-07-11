package jp2;

import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static jp2.MySqlConnection.getConnection;

public class BookList {
    private Connection conn = new MySqlConnection().getConnection();
   static List<Book> bookList = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public BookList() throws SQLException {
    }

    public void addBook() throws SQLException{
        Connection connection = getConnection();
        System.out.println("Enter BookID: ");int id = input.nextInt();
        System.out.println("Enter BookName: ");String name= input.next();
        System.out.println("Enter Author: ");String author= input.next();
        System.out.println("Enter Price: ");double price= input.nextDouble();
        String query = "insert into BookStores values(?,?,?,?)";

        PreparedStatement preparedStatement =connection.prepareStatement(query);
        preparedStatement.setInt(1,id);
        preparedStatement.setString(2,name);
        preparedStatement.setString(3,author);
        preparedStatement.setDouble(4,price);

        int rowInserted = preparedStatement.executeUpdate();
        if (rowInserted > 0){
            System.out.println("Insert Thanh Cong");
        }

        bookList.add(new Book(id,name,author,price));
    }

    public void SaveToFile() throws IOException {
        Writer writer = new FileWriter("BookStore.json");
        new Gson().toJson(bookList,writer);
        writer.close();
        System.out.println("Save File Complete !");
    }

    public void showBook() throws SQLException {
        Connection connection = getConnection();
        String query = "Select * from BookStores";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            resultSet.getInt(1);
            resultSet.getString(2);
            resultSet.getString(3);
            resultSet.getDouble(4);
            System.out.println(resultSet.getInt(1) + " | " + resultSet.getString(2) + "|" + resultSet.getString(3) + "|" + resultSet.getDouble(4));
        }

    }

}
