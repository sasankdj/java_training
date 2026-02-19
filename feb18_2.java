//create a java application where we have 1 classit contains 1 static and non static variable and static method m1 having int as params and returns ntg and a non static method m2 having float as params and returns string then invoke this methods under main method by providing dynamic inps 

import java.util.Scanner;

class feb18_2{
    static Scanner sc = new Scanner(System.in);
    static int a=sc.nextInt();
    int b=sc.nextInt();
    static void m1 (int p){
        System.out.println("in m1");
        feb18_2 obj=new feb18_2();
           System.out.println(a+","+obj.b);

        System.out.println(p);
    }
    String m2(float f){
        System.out.println("in m2");
        System.out.println(a+","+b+","+f);
        System.out.println("eneter a string for return in m2");
        return sc.next();
    }
    public static void main(String[] args) {
        System.out.println("enter for the m1");
        m1(sc.nextInt());
        System.out.println("enter for the m2");
        feb18_2 obj=new feb18_2();
        
        System.out.println(obj.m2(sc.nextFloat()));

    }
}