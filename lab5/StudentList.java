package lab5;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StudentList {
    private static ArrayList<Student> list;
    private  static Scanner input = new Scanner(System.in);
    StudentList studentList = new StudentList();


    public static void listStudent() throws IOException{
       list.add(new Student(1,"sdsd", "dsffsd", 4.5));
       list.add(new Student(2,"Tran", "HOag",5.6));

    }


    public void add(Student s){
        list.add(s);
    }

    public void remove(int id) {
        boolean found = false;
        for (Student s:list
             ) {
            if (s.getId() == id){
                int choice;
                System.out.println("Are you sure deleting this student? (1.Yes 2.No ");
                choice = new Scanner(System.in).nextInt();
                if (choice ==1)
                    list.remove(s);
                found =true;
            }
        }
        if (found == false){
            System.out.println("Cannot find student with id "+ id);
        }
    }
    public void getStudent() throws IOException{
        List<Student> studentList;
        Gson gson = new Gson();
        FileReader reader = new FileReader("Lab5Stu.json");
        studentList = new Gson().fromJson(reader, new TypeToken<List<Student>>(){}.getType());
        for (Student student: studentList
             ) {
            System.out.println(student);
        }
        reader.close();
    }
    public static void addStudent() {
        int id = 0;
        String fn;
        String ln;
        double mark;

        System.out.println("Enter Student ID:");
        id = input.nextInt();
        System.out.println("Enter first name:");
        fn= input.next();
        System.out.println("Enter last name:");
        ln = input.next();
        System.out.println("Enter mark: ");
        mark =input.nextDouble();
        Student s = new Student(id, fn, ln, mark);
        list.add(s);
    }
    public static void WriteFile() throws IOException {
        Gson gson= (new GsonBuilder()).setPrettyPrinting().create();
        Writer writer = new FileWriter("Lab5Stu.json");

        gson.toJson(list,writer);
        writer.close();
    }

    public static void AddStu() throws IOException {
        listStudent();
        addStudent();


    }
}
