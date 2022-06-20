package database;

import java.awt.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

import static jdbcdemp.ConnectionExample.createProduct;
import static jdbcdemp.ConnectionExample.getConnection;

public class Application {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws SQLException {

        ConnectionEx conn = new ConnectionEx();


        menu();

        while (true){
            int choice = input.nextInt();
            if (choice==1){

                   conn.addProduct();
            menu();
            } else if (choice==2) {
                conn.editProduct();
                menu();
            } else if (choice==3) {
                conn.deleteProduct();
                menu();
            } else if (choice ==4) {
                conn.readProductData();
                menu();
            }else if (choice==5){
                conn.searchById();
                menu();
            } else if (choice==6) {
                conn.searchByName();
                menu();
            }


        }

    }
    public static void menu(){
        System.out.println("1.Add Product");
        System.out.println("2.Edit Product");
        System.out.println("3.Delete Product");
        System.out.println("4.View All Product");
        System.out.println("5.Search by ID");
        System.out.println("6.Search Product by name");
        System.out.println("7.Exit");
    }
}
