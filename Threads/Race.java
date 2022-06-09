package Threads;

class RaceCar extends Thread {
        int finish;
        String name;

        RaceCar(int finish, String name){
            this.finish= finish;
            this.name = name;
        }
        //Override run() method racing logic
    public void run(){
            for (int i= 0; i<finish;i++){
                System.out.println(name + ":" + (i+1) + "running..");
                try {
                    //sleep for a random amount of time. To get a random value,
                    //java.util.Math..random () method is used.
                    Thread.sleep(Math.round(Math.random()*5000));
                }catch (Exception e){
            }}
                System.out.println(name + " finished");
    }
}
public class Race{
    public static void main(String[] args) {
        //create an array of runnable RaceCar objects
        RaceCar[] cars = new RaceCar[5];
        cars[0]= new RaceCar(10, "Mario");
        cars[1] = new RaceCar(10, "Songoku");
        cars[2] = new RaceCar(10, "Herman");
        cars[3] = new RaceCar(10, "Doremon");
        cars[4] = new RaceCar(10, "Hoang Phi Long");
        //start racing
        for (int i = 0; i<5 ; i++)
            cars[i].start();
    }
}
