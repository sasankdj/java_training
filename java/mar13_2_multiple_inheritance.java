import java.util.Scanner;

class Airtel{
    Scanner sc= new Scanner(System.in);
    double recharge(int plan){
        if(plan==1)
            return 199;
        if(plan==2)
            return 299;
        return 399;
    }

}
class CellShop extends Airtel{
    double bill=0;
    
    void plans(){
        System.out.println("choose a plan \nthe current plans availabe are \n 1.199-un calls \n 2. 299 uc + data \n 3.399 uc+data");
     }
     
    
    void billing(){
        System.out.println("Thank you for shopping with us \n your toatl amount is \n bill: "+bill+"+ tax 18rs:"+(bill+18));
       
    }
    void selection(){
        plans();
        int n=sc.nextInt();
        switch (n) {
            case 1:
                
                bill=bill+recharge(1);
                System.out.println("your recharge of "+ recharge(199)+"is successful");

                
                break;
            case 2:
                bill=bill+recharge(2);
                System.out.println("your recharge of "+ recharge(299)+"is successful");
                break;
            case 3:
                bill=bill+recharge(3);
                System.out.println("your recharge of "+ recharge(399)+"is successful");

                break;    
            default:
                System.out.println("enter a valid input");
                break;
        }
        System.out.println("enter a choice \n 1 to do recharge again \n 2 to continue billing \3 exit");
        int c=sc.nextInt();
        if(c==1){
            selection();
        }
        else if(c==2){
            billing();

        }
        else{
            System.out.println("thank you");
        }

    }
}
public class mar13_2_multiple_inheritance extends CellShop {

    public static void main(String[] args) {
        mar13_2_multiple_inheritance obj = new mar13_2_multiple_inheritance();
        obj.selection();
    }
}
