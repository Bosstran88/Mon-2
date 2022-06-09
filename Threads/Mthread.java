package Threads;

class Msthread extends Thread{
    String name;
    int finish;


    Msthread( String name,int finish){
        this.name = name;
        this.finish = finish;
    }

    public void run(){
        for (int i = 0;i<finish;i++){
            System.out.println(name + (i+1) );
            try {
                Thread.sleep(Math.round(Math.random()*1500));
            }catch (Exception e){
            }
        }
        System.out.println(name + "exiting");
        }
}
public class Mthread{
    public Mthread(String first, int i) {
    }

    public static void main(String[] args) {
        Msthread[] mthread = new Msthread[3];

        mthread[0] = new Msthread("First :",5);
        mthread[1] = new Msthread("Second :", 5);
        mthread[2] = new Msthread("Third :", 5);

        for (int i = 0; i< 3;i++)
            mthread[i].start();
    }
}
