//create a java application where we have 1 class it contains a non static method m1 having no parameter and returns short this method in this method we have a local variable print this variable under main method by providing dynamic inputs.

import java.util.Scanner;

public class p10 {
    static Scanner sc = new Scanner(System.in);
    static p10 obj = new p10();
    short m1(){
        // int a =sc.nextInt();
        short s= sc.nextShort();
        return s;
    }
    public static void main(String[] args) {
      System.out.println( obj.m1()); 
    }
}
