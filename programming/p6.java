import java.util.Scanner;

public class p6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter 2 numbers ");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        System.out.println("enter the choice \n 1 for addition \n 2 for substarction \n 3 for multiplication \n 4 for division ");
        int choice=sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println(n1+n2);
                break;
            case 2:
                System.out.println(n1-n2);
                break;
            case 3:
                System.out.println(n1*n2);
                break;
            case 4:
                System.out.println(n1/n2); 
                break;                   
            default:
                System.out.println("enter a valid input");
                break;
        }
    }
}
