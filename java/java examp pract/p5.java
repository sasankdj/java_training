//Create a java application where we have class bank it contains a static variable balance and two non static methods withdraw and deposit having parameter as double amount and returns the available balance then invoke this methods under main method based on user input if user wants to deposit invoke deposit method,if user wants to withdraw invoke withdraw method by providing dynamic inputs.

import java.util.Scanner;

public class p5 {
    static Scanner sc= new Scanner(System.in);
    static p5 o= new p5();
    static double balance=0;

    double deposit(double d){
        balance+=d;
        return balance;
    }
     double withdraw(double d){
        balance-=d;
        return balance;
    }
    public static void main(String[] args) {
        System.out.println("enter a choice to choose : \n 1 for deposit \n 2 for withdraw ");
        int ch = sc.nextInt();
        if(ch==1){
            System.out.println("enter a amount to deposit ");
            o.deposit(sc.nextDouble());
            
        }
        else if (ch==2){
            System.out.println("enter a amount to withdraw ");
            o.withdraw(sc.nextDouble());
        }
        else{
            System.out.println("enter a valid choice");
        }
    }
}
