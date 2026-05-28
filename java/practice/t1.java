public class t1 extends Thread{
   static t1 obj = new t1();
    public void run(){
        obj.print();
    }
    public void print(){
synchronized(this){

    for (int i = 0; i <10; i++) {
        System.out.print(i+" ");
    }
}
        for (int i = 10; i <20; i++) {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        t1 th1 = new t1();
        t1 th2= new t1();
        th1.start();
        th2.start();
    }
}
