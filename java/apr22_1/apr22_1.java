package p1;
import java.util.Scanner;

// import javax.naming.LimitExceededException;

import p2.*;

public class apr22_1{
       static double limit=1000;

    static void pay(double amount) throws LimitExceedException{
                if(amount<=limit){
                    limit=limit-amount;
                }
                else{
                    
                    LimitExceedException obj = new LimitExceedException("hello dude");
                    throw obj;
                    // System.out.println(obj);
                }
        }
    public static void main(String[] args) throws LimitExceedException{
        Scanner sc= new Scanner(System.in);
        while(true){
            System.out.println("enter a amount");
            
            pay(sc.nextDouble());
        }

    }
}