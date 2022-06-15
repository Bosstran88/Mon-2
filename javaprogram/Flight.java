package javaprogram;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Flight {
    private int number;
    private String destination;

    public Flight(int number, String destination) {
        this.number = number;
        this.destination = destination;
    }
    public Flight(){
    }

    public int getNumber() {
        return number;
    }

    public String getDestination() {
        return destination;
    }
    public void display(){

            System.out.println(getNumber() + "-" + getDestination());

    }

    public void Flight() throws IOException {
        int number=0;
        String destination;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number Flight: ");
        number = sc.nextInt();
        System.out.print("Enter destination: ");
        destination = sc.next();
        Flight flight = new Flight(number,destination);
        if (number==0){
            System.err.println(" Number should be positive");
        } else if (number< 0) {
            System.out.println("should be");
            display();
        }else {
            System.out.println("should be number");
        }


    }

    public static void main(String[] args) throws IOException {
        Flight g1 = new Flight(857, "Toronto");
        g1.display();
        g1.Flight();

    }
}
