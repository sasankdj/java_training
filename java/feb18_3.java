//create a java application it contains a non static method having params and return type and a static method having params and return type then invoke these methods under main method by providing dynamic inps

import java.util.Scanner;

public class feb18_3 {
    static Scanner sc = new Scanner(System.in);
    int m1(int a ){
        return a;
    }
    static float m2(int b){
        return (float)b;
    }
    public static void main(String[] args) {
        System.out.println(m2(sc.nextInt()));
        feb18_3 obj = new feb18_3();
        System.out.println(obj.m1(sc.nextInt()));
    }
}
