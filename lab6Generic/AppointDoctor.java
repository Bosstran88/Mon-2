package lab6Generic;

import javax.print.Doc;
import java.util.PriorityQueue;

public class AppointDoctor {
    //create a new instance of appointDoctor
    public AppointDoctor(){
    }

    public static void main(String[] args) {
        //to do code application logic here
        //creating a priorityQueue
        PriorityQueue pq = new PriorityQueue();
        //creating Doctor object
        Doctor Cardiologist = new Doctor("Casuality",1);
        Doctor Gynecologist = new Doctor("Surgery",2);
        Doctor Paediatric = new Doctor("Routine check-up",3);

        //Add Doctor objects to the Queue
        pq.offer(Cardiologist);
        pq.offer(Gynecologist);
        pq.offer(Paediatric);

        //remove the elements from the queue as per their priorities
        while (!pq.isEmpty()){
            //displaying the header information
            System.out.println("\nAppointing doctor based on their priority:");
            System.out.println("****************");
            //removeing the Doctor as per their priority
            Doctor doctor = ((Doctor) pq.remove());
            //invoking the toString() method;
            System.out.println(doctor.toString());
        }
    }
}
