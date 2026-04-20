//cja where we have 1 class here it may couse 3 differentt types of exceptions then handle any 1 of the exception

import java.util.InputMismatchException;
import java.util.Scanner;

public class apr17_2 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        try {
            int n=sc.nextInt();
            System.out.println(10/0);
            apr17_2 obj  =null;
            System.out.println(obj.toString());
        }
        // catch(InputMismatchException e){
        //     System.out.println(e);
        // } 
        // catch (ArithmeticException e) {
        //     e.printStackTrace();
        // }
        // catch(NullPointerException e){
        //     // System.out.println(e.getMessage());
        //     e.printStackTrace();
        // }
        catch(InputMismatchException | ArithmeticException | NullPointerException e){ // another way
            System.out.println(e.getLocalizedMessage());
        }
        System.out.println("babai inka em ledu");
    }
}