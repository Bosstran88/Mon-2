package jp2;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class Application {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws IOException, SQLException {
            BookList bookList = new BookList();

    while (true){
        menu();
        int choice = input.nextInt();
        switch (choice){
            case 1 ->bookList.addBook();
            case 2 ->bookList.SaveToFile();
            case 3 ->bookList.showBook();
            case 4 ->System.exit(0);

        }
    }
    }
    public static void menu(){
        System.out.println("==========MENU===========");
        System.out.println("1. Add Book records");
        System.out.println("2. Save");
        System.out.println("3. Display book records");
        System.out.println("4. Exit");
    }
}
