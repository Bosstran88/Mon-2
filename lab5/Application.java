package lab5;

import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class Application {
    private  static Scanner input = new Scanner(System.in);
    private static StudentList list;

    public static void menu(){
        System.out.println("MENU");
        System.out.println("1.Add student");
        System.out.println("2.Update a Student");
        System.out.println("3. Delete a Student");
        System.out.println("4. Search Student");
        System.out.println("5.Display All Student");
        System.out.println("6. Save to File");
        System.out.println("7. Load to File");
        System.out.println("8. Exit");
        System.out.println("Your choice;");
    }

    public static void main(String[] args) throws IOException {
        list = new StudentList();
        menu();

        while (true){
            int choice;
            System.out.println("#");
            choice= input.nextInt();
            if (choice ==1 ){
                StudentList.AddStu();
                menu();
            }else if (choice ==2){
                //updateStudent();
                menu();
            }
            else if (choice == 3) {
                deleteStudent();
                menu();
            }else if(choice ==4){
                //searchStudent();
                menu();
            }
            else if (choice==5) {
                showAllList();
                menu();
            } else if (choice ==7) {
                loadToFile();
                menu();
            } else if (choice==8) {
                System.exit(0);
            }
        }
    }

    public static void deleteStudent(){
        int id;
        System.out.println("Enter student id:");
        id = input.nextInt();
        list.remove(id);
    }

    public static void showAllList() throws IOException {
        StudentList studentList= new StudentList();
        studentList.listStudent();
    }
    public static void loadToFile() throws IOException {
        StudentList studentList = new StudentList();
        studentList.getStudent();
    }



}
