package mythread;

import java.io.File;

public class Dir {
    static void listPath(File path){
        // get all file (or directories) in file path
        File[] files = path.listFiles();
        for (int i = 0;i< files.length;i++){
            System.out.println(files[i].toString());
        }
    }

    public static void main(String[] args) {
        listPath(new File("C:USERS"));
    }
}
