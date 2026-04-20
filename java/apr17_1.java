//cja take int inps from user if user gives invalid input ask him to re-enter  until he gives valid input


import java.util.Scanner;

public class apr17_1 {
static Scanner sc= new Scanner(System.in);
    static void m1(int a){
        try {
            System.out.println(10/a);
        } catch (ArithmeticException e) {
            // System.out.println(e.getMessage());
            System.out.println("incorrect value please try again");
            m1(sc.nextInt());
        }
    }
    public static void main(String[] args) {
        System.out.println("enter a value to divide with 0");
       m1(sc.nextInt());
    }
}