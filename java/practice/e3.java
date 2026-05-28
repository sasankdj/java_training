import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class A implements Runnable{
    public void run(){
        for (int i = 0; i <20; i++) {
             if(i%2==0){
                System.out.print(i+" ");
            }
        }
    }
}
class B implements Runnable{
    public void run(){
        for (int i = 0; i <20; i++) {
            if(i%3==0){
                System.out.print(i+" ");
            }
        }
    }
}
public class e3 {
public static void main(String[] args) {
    ExecutorService s= Executors.newFixedThreadPool(2);
    s.execute(new A());
    s.execute(new B());
}
    
}