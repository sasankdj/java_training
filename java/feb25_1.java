//create a java application where we have 1 class it contains 3 non static methods having params and m2 ret the return value of m1, m3 returns the ret value of m2 then invoke all these props by providing dynamic inps under main method

import java.util.Scanner;

class feb25_1{
    static Scanner sc = new Scanner(System.in);

    int m1(int b ){
        System.out.println(b);
        return sc.nextInt();
    }
    int m2(int f ){
        System.out.println(f);
        return m1(sc.nextInt());
    }
    int m3(int d ){
        System.out.println(d);
        return m2(sc.nextInt());
    }

    public static void main(String[] args) {
        feb25_1 obj = new feb25_1();
	    System.out.println(obj.m3(sc.nextInt()));
    }
}