//cja where we need to create 1 user defined thread and print 1 to 10 by using it with a time interwal of 1 sec
public class apr24_2 extends Thread {
    public void run(){
        try {
            for (int i = 1; i <=10; i++) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
           
        }
    }
    public static void main(String[] args) {
        apr24_2 t1= new apr24_2();
        t1.start();
    }
}
