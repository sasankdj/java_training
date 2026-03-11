//cja where we need to statisfy this keyword at all levels

import java.util.Scanner;

public class mar10_4 {
    static Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();

    mar10_4(int a) {
        System.out.println("local var in construct" + a);

    }

    mar10_4(float a) {
        this(sc.nextInt());
        System.out.println("local in 2nd constructor" + a);

    }

    int m1(int a) {
        System.out.println("global var" + this.a);
        System.out.println("local var" + a);

        return sc.nextInt();
    }

    int m2(float a) {
        System.out.println(this.m1(sc.nextInt()));
        System.out.println("local var" + a);

        return sc.nextInt();
    }

    public static void main(String[] args) {
      System.out.println(new mar10_4(sc.nextFloat()).m2(sc.nextFloat())); 
    }
}