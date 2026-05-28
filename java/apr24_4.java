//cja where we need to create 3 user defined threads and then print 1 to 10, 20 to 30, 40 to 30 respectively here allow 1 by one flow of execution without any interuption

 class A extends Thread {
public void run(){
    for (int i = 1; i <=10; i++) {
        System.out.print(i+" ");
    }
}
    
}
 class B  extends Thread{
public void run(){
    for (int i = 20; i <=30; i++) {
        System.out.print(i+" ");
    }
}
    
}
public class apr24_4 extends Thread{
    public void run(){
    for (int i = 40; i >=30; i--) {
        System.out.print(i+" ");
    }
}
    public static void main(String[] args) {
        A t1 = new A();

        B t2 = new B();
        apr24_4 t3= new apr24_4();
        try {
            
            t1.start();
            t1.join();
            t2.start();
            t2.join();
            t3.start();
        } catch (Exception e) {
           
        }
    }
}
