package lab5;

import java.util.Scanner;

public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private double mark;

    public Student(int id, String fn, String ln, double mark){}

    public Student(int id, String firstName, String lastName, int age, double mark) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.mark = mark;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }
    public void scanInfo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ID: ");
        this.id = scanner.nextInt();
        System.out.println("Enter first name:");
        this.firstName = scanner.nextLine();;
        System.out.println("Enter last name:");
        this.lastName = scanner.nextLine();
        System.out.println("Enter mark:");
        this.mark = scanner.nextDouble();
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", mark=" + mark +
                '}';
    }
}
