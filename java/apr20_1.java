//cja where we need to raise a input mismatch exception, if the exception occur then we need to raise another arithematic exception and handle it ,if it didnt occur then we nee dto rasie a null pointer exception and handle it at the end of the program you must and should handle string indexout of bound exception

import java.util.InputMismatchException;
import java.util.Scanner;

public class apr20_1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        try {
            int a=sc.nextInt();
            int b=sc.nextInt();
            try {
                String s=null;
                s.length();
            } catch (Exception e) {
                System.out.println(e);
            }
        } catch (InputMismatchException e) {
            try {
                System.out.println(10/0);
            } catch (ArithmeticException e1) {
               System.out.println(e1.getMessage());
            }
        }
try {
    
    throw new ArrayIndexOutOfBoundsException();
} catch (Exception e) {
   System.out.println(e);
}
    }
}
