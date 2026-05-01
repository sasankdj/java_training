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
public class may1_5 extends Thread{
    public void run(){
        bus obj = new bus();
        obj.seat();
    }
    public static void main(String[] args) {
        Thread t1= new may1_5();
        Thread t2= new may1_5();
        Thread t3= new may1_5();

        t1.start();
        t2.start();
        t3.start();

    }
}
