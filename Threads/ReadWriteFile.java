package mythread;

import java.io.*;

public class ReadWriteFile {
    public void readData() throws IOException {
        try {
            File f = new File("test.txt");
            FileInputStream fis = new FileInputStream(f);
            BufferedInputStream bis = new BufferedInputStream(fis);
            int i;
            while ((i = bis.read()) !=-1){
                System.out.println((char) i);
            }
            System.out.println("");
            fis.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public void writeData(String str) throws IOException {
        //chuyen chuoi thanh byte
        byte []b = str.getBytes();
        try {
            FileOutputStream fos = new FileOutputStream("text.txt");
            fos.write(b);
            fos.flush();
            fos.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        ReadWriteFile d = new ReadWriteFile();
        d.readData();
        d.writeData("hom nay hoc java");
    }
}
