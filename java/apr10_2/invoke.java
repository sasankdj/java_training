package test;

import java.util.Scanner;

import test.cc1;

public class invoke {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        cc1 obj = new cc1();
        cc2 obj2 = new cc2();
        cc3 obj3 = new cc3();
        System.out.println(obj.m1(sc.nextInt()));
        System.out.println(obj.m2(sc.nextInt()));
        System.out.println(obj.m3(sc.nextInt()));
        System.out.println(obj2.m4(sc.nextInt()));
        System.out.println(obj2.m5(sc.nextInt()));
        System.out.println(obj3.m6(sc.nextInt()));
        // obj.m6.m7(sc.nextInt());
        // I3.I4.m7(sc.nextInt());
        
    }
}
