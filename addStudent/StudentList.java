package addStudent;

import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.List;

public class StudentList {
    public void addStudent() throws IOException{
        List<Student> student = Arrays.asList(
               new Student (1,"Nguyen Quang Huy", 34,8.0 ),
        new Student(2, "Nguyen Quang Minh", 33, 7.0),
        new Student(3,"Nguyen Quang Hoi", 30,8.3 ),
        new Student(4,"Nguyen Quang Huynh", 14,6.0 )
        );

        Writer writer= new FileWriter("Student.json");

        new Gson().toJson(student, writer);

        writer.close();
        System.out.println("add complete!");
    }
}
