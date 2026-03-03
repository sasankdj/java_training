//Create a java application where we have 1 class it contains three instance variables and a non static method m1 having float,Boolean as parameters and returns nothing and a static method m2 having parameter as String and returns Boolean then print instance variables under both the methods and invoke those methods under main method by providing dynamic inputs.

import java.util.Scanner;

public class p1 {
    static Scanner sc= new Scanner(System.in);
   static p1 obj = new p1();
    int a=sc.nextInt();
    float f =sc.nextFloat();
    double d= sc.nextDouble();

    void m1(float f , boolean b){
        System.out.println(f);
        System.out.println(b);
        System.out.println(a);
        System.out.println(this.f);
        System.out.println(d);
    }
    static boolean m2(String s){
        System.out.println(s);
         System.out.println(obj.a);
        System.out.println(obj.f);
        System.out.println(obj.d);
        return sc.nextBoolean();
    }
    public static void main(String[] args) {
        obj.m1(sc.nextFloat(), sc.nextBoolean());
        System.out.println(m2(sc.next()));
    }
}
