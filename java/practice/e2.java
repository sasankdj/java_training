class A {
    static void print(){
        for (int i = 0; i <10; i++) {
            Thread t = Thread.currentThread();
            if(t.getName().equals("1")){
                if(i%2==0){
                    System.out.println(i);
                }
            }

             if(t.getName().equals("2")){
                if(i%3==0){
                    System.out.println(i);
                }
            }
        }

    }
}
public class e2 extends Thread{
    public void run(){
        A.print();
    }
 public static void main(String[] args) {
    Thread t1= new e2();
    Thread t2= new e2();
    t1.setName("1");
    t2.setName("2");
    t1.start();
    t2.start();

 }    
}
