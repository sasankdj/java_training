//craete a java application where we have 1 class in that create 1 instance variable and a non static method with params and ret type, and a default constructor and call all there params under main method

import java.util.Scanner;

class mar2_1 {
    static Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();

    int m1(int a) {
        System.out.println(a);
        return sc.nextInt();
    }

    mar2_1() {
        System.out.println("in default constructor");
        System.out.println(a);
    }

    public static void main(String[] args) {
        mar2_1 obj = new mar2_1();
        System.out.println(obj.m1(sc.nextInt()));
    }
}