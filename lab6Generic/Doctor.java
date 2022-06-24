package lab6Generic;

import javax.print.Doc;

public class Doctor implements Comparable{
    //Create a new instance of Doctor
    public Doctor(){}

    public Doctor(String name, int task){
        this.name=name;
        this.task=task;
    }
    public int compareTo(Object obj) {
        //create a doctor object
        Doctor doctor = (Doctor) obj;

        int a = 0;
        int b = 0;

        a = this.task;
        b = doctor.task;

        //highest number determines the highest  priority for the appointments
        if (a<b)
            return -1;
        if (a>b)
            return 1;
        return 0;

    }


    public String toString(){
        return "\nThe Doctor is appointed for ="+name+"\nThe Priority for the appointment is ="+task;
    }
    private String name ="";
    private int task = 0;



}
