import java.util.Scanner;

class Bank {
    static Scanner sc= new Scanner(System.in);
    double balance = 1000.0;
    double deposit(double a){
        balance+=a;
        System.out.println("balance after depositting "+a+"is"); 
        return balance;
    }
    double withdraw(double a){
        if(a>=balance){

            System.out.println("no enough amount");
            
        }
        else{
            balance-=a;
            System.out.println("balance after withdraw "+(int)a+"rs is");
        }
        return balance;
    }
    void balance(){
        System.out.println(balance);
    }
}
public class mar12_2 extends Bank {
    void transaction(){
        System.out.println("enter a choice to choose \n 1 for deposit \n 2 for withdraw \n 3 for balance");
        int a =sc.nextInt();
        switch (a) {
            case 1:
                System.out.println("enter amount to deposit");
               System.out.println(deposit(sc.nextDouble())); 
                break;
            case 2:
                System.out.println("enter amount to withdraw");
             System.out.println(withdraw(sc.nextDouble()));  
                break;
            case 3:
              balance();
                break;    
            default:
                System.out.println("invalid option");
                break;
        }
        System.out.println("enter 1 to perform another transaction or else press any key to exit ");
        int n=sc.nextInt();
        if(n==1){
            transaction();
        }
        else{
            System.out.println("thank you");
        }
    }
    public static void main(String[] args) {
        mar12_2 obj = new mar12_2();

        obj.transaction();
    }
}
