//cja take int inps from user if user gives invalid input ask him to re-enter  until he gives valid input
import java.util.InputMismatchException;
import java.util.Scanner;

public class apr18_1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       while (true) { 
        try {
            int n=sc.nextInt();
            System.out.println("bagundi andi");
            break;
        } catch (InputMismatchException e) {
            System.out.println("enti bhayya idi");
            sc.next();      //clear the buffer
        }}
    }
}
