//create a java application where we have 1 class it contains 2 static and 2 non static variables, 2 non static methods having no params and returns nothing then print the gloabal variables under both the methods and invoke these methods under main method with respect to to 2 different objects by providing dynamic inps

import java.util.Scanner;

class feb17_2{
    static int a;
    static float f;
    int b;
    float c;
    static Scanner sc=new Scanner(System.in);
    void m1(){
        System.out.println(a);
        System.out.println(f);
        System.out.println(b);
        System.out.println(c);
    }
    void m2(){
        System.out.println(a);
        System.out.println(f);
        System.out.println(b);
        System.out.println(c);
    }
    public static void main(String[] args) {
        a=sc.nextInt();
        f=sc.nextFloat();
        feb17_2 obj1 =new feb17_2();
        obj1.b=sc.nextInt();
        obj1.c=sc.nextFloat();

        a=sc.nextInt();
        f=sc.nextFloat();
        feb17_2 obj2= new feb17_2();
        obj2.b=sc.nextInt();
        obj2.c=sc.nextFloat();
        obj1.m1();
        obj2.m2();
    }
}