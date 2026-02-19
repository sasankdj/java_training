//create a java application where we have 1 class it contains 1 static and 2 instance var and a non static methods m1 having short as params and returns long and a static method m2 having int, bool as paarams and returns double ivoke all these props under main method by providing dynamic inps 

import java.util.Scanner;

public class feb18_4 {
    static Scanner sc= new Scanner(System.in);
    static{
        System.out.println("enter integer for the value a ");
    }
    static int a=sc.nextInt();
    float f =sc.nextFloat();
    int b= sc.nextInt();
    long m1(short s){
        System.out.println("enter for long return ");
        return sc.nextLong();
    }
    static double m2(int i,boolean b){
        System.out.println("enter for double return ");

        return sc.nextDouble();
    }
    public static void main(String[] args) {
        System.out.println(a);
        System.out.println("enter a float value for f and int for b");
        feb18_4 obj = new feb18_4();
        System.out.println("enter a short value for m1");
        System.out.println(obj.m1(sc.nextShort()));
        System.out.println("enter the integer and boolean value for m2");
        System.out.println(m2(sc.nextInt(), sc.nextBoolean()));

    }
}
