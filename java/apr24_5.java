class A   {
    static void m1(){
        for (int i = 0; i <20; i++) {
            Thread t= Thread.currentThread();
            if (t.getName().equals("hi")) {
                if (i%2==0) {
                    System.out.println(i);
                }
            } else if (t.getName().equals("hello")) {
                if (i%3==0) {
                    System.out.println(i);
                }
            }

        }
    }
    
}
public class apr24_5 extends Thread{
    public void run(){
        A.m1();
    }
    public static void main(String[] args) {
        apr24_5 t1= new apr24_5();
        apr24_5 t2= new apr24_5();
        t1.setName("hi");
        t2.setName("hello");
        t1.start();
        t2.start();


    }
}