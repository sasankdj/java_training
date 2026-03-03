public class p1 {
   private int balance=0;
        void deposit(int a ){
            balance+=a;
            System.out.println(a+" deposited successfully");
            displayBalance();
        }
        void withdraw(int a){
            if(a<=balance){
                balance-=a;
            System.out.println(a+ "withdrawn successfully");
            displayBalance();
            }
            else{
                System.out.println("Not enough money..");
            }
            
        }
        void displayBalance(){
            System.out.println("Your current balance is "+balance);
        }
public static void main(String[] args) {
    p1 obj=new p1();

    obj.deposit(100);


}    
}
