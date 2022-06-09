package mythread;

public class MyThread extends Thread{
    int finish;
    String name;



    public MyThread( int finish, String name) {
        this.finish= finish;
        this.name = name;

    }

    public void run(){
        for (int i = 0 ; i<finish;i++){
            System.out.println(name + " : " + (i+1) + "running...");
            try {
                Thread.sleep(Math.round(Math.random()*1500));
            }catch (Exception e){
        }
    }
        System.out.println(name + " finished");
    }


}
