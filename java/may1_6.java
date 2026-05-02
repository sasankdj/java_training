import java.util.Scanner;

class bus{
    static Scanner sc= new Scanner(System.in);
    static boolean booking =false;
   static synchronized void seat(){
        if(!booking){
            System.out.println("enter your name");
            sc.next();
            System.out.println("age");
            sc.nextInt();
            System.out.println("gender");
            sc.next();
            System.out.println("the price is 1000 will you like to book");
            boolean b=sc.nextBoolean();
            if(b){
                System.out.println("booking successfull");
                booking=true;
            }

        }
        else{
            System.out.println("altready booked");
        }
    }       
}
public class may1_6 implements Runnable{
    public void run(){
        bus obj = new bus();
        obj.seat();
    }
    public static void main(String[] args) {
        may1_6 obj = new may1_6();
        Thread t1= new Thread(obj);
        Thread t2= new Thread(obj);
        Thread t3= new Thread(obj);

        t1.start();
        t2.start();
        t3.start();

    }
}
