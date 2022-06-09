package mythread;
class Message extends Thread{
    String message;
    int timeout;
    String priority;

    Message(String message, int timeout, String priority){
        this.message = message;
        this.timeout = timeout;
        this.priority= priority;
    }
    public void run(){
        for ( int i= 0;i<2;i++){
            System.out.println(message);
            System.out.println("Timeout :" + timeout);
            System.out.println("Priority : "+ priority);
        }try {
            Thread.sleep(Math.round(Math.random()));
        }catch (Exception e){
            System.out.println("...........");
        }
    }

    @Override
    public String toString() {
        return "Message{" +
                "message='" + message + '\'' +
                ", timeout=" + timeout +
                ", priority='" + priority + '\'' +
                '}';
    }
}


public class MessageBoard {
    public static void main(String[] args) {
        System.out.println("-----MAIN BOARD----");
        System.out.println("==========================");
        Message[] message = new Message[2];
        message[0] = new Message("multithreading", 1000, "high");
        message[1] = new Message("multitasking", 2000,"medium");

        for (int i=0;i<2;i++)
            message[i].start();
    }
}
