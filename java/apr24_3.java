//cja where we need to create 2 userdefined threads, print 1 to 10 by using 1st thread and 20 to 30 using 2nd thread

class A implements Runnable{
    public void run(){
        for (int i = 1; i <=10; i++) {
            System.out.print(i+" ");
        }
    }
}
public class apr24_3 implements Runnable{
    public void run(){
        for (int i = 20; i <=30; i++) {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args)  {
        A r1 = new A();
        apr24_3 r2 = new apr24_3();
        Thread t1= new Thread(r1);
        Thread t2= new Thread(r2);
        t1.start();
        // try {
            
        //     t1.join();      //wait until the 1st therad completes
        // } catch (Exception e) {
        //     // TODO: handle exception
        // }
        t2.start();

    }
}
