//Create a java application where we have 1 class it contains two instance variables and two static variables and two non static methods having parameter and return type then invoke m1 under m2, m2 under main and print those global variables under main method by providing dynamic inputs.

import java.util.Scanner;

public class p2 {
    static Scanner sc = new Scanner(System.in);
    static p2 obj=new p2();
    int a =sc.nextInt();
    float f=sc.nextFloat();
    static int b=sc.nextInt();
    static float g=sc.nextFloat();
    int m1(int a ){
        System.out.println(a);
        return sc.nextInt();
    }
    float m2(float f){
        m1(sc.nextInt());
        System.out.println(f);
        return sc.nextFloat();
    }
    public static void main(String[] args) {
        obj.m2(sc.nextInt());
        System.out.println(obj.a);
        System.out.println(obj.f);
        System.out.println(b);
        System.out.println(g);
    }
}
