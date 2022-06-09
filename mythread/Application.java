package mythread;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        MyThread[] thread = new MyThread[4];
        thread[0] = new MyThread(10, "cho");
        thread[1] = new MyThread(10,"meo");
        thread[2] = new MyThread(10,"ga");
        thread[3] = new MyThread(10, "sau");

        for (int i = 0 ; i< 4 ;i++)
            thread[i].start();
    }

}
