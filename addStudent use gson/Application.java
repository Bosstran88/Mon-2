package addStudent;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import static java.awt.SystemColor.menu;

public class Application {
    private static Scanner intput = new Scanner(System.in);
    private static StudentList list;

    public static void menu(){
        System.out.println("Menu:");
        System.out.println("=======================");
        System.out.println("1: Add a list of Student and save to File");
        System.out.println("2: Loading list of");
    }

    public static void main(String[] args) throws IOException {
        list =new StudentList();
        menu();


        while (true){
            int choice;
            System.out.println("#:");
            choice = intput.nextInt();
            if (choice ==1){
                list.addStudent();
                menu();
            } else if (choice == 2) {
               loadingList();
                menu();
            }else if (choice ==3 ){
                System.exit(0);
            }
        }
    }
    public static void loadingList() throws IOException {
        List<Student> studentList;
        Gson gson = new Gson();
        FileReader reader = new FileReader("Student.json");
        studentList = new Gson().fromJson(reader,new TypeToken<List<Student>>(){}.getType());

        for (Student student:studentList
             ) {
            System.out.println(student);
        }
        reader.close();
    }
}
