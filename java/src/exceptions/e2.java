// package exceptions;

import java.util.Scanner;
// import java.lang.ArithmeticException;
public class e2 {
    public static void main(String[] args) {
        // Scanner sc= new Scanner(System.in);
        try {
            if(true){

                throw new ArithmeticException("sasank");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
