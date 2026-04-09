//cja 1 interface 1 abstract method and an inner interface which contains 1 abstract method then provide functionality for this and invoke them by providing dynamic inps

import java.util.Scanner;

public interface apr9_2 {
    Scanner sc= new Scanner(System.in);
    int m1(int a);
    interface I2{
        float m2(float a);
    }
    public static void main(String[] args) {
        apr9_2 obj = new apr9_2() {
            public int m1(int a){
                System.out.println("in m1 "+a);
                return sc.nextInt();
            }
        };

        obj.m1(sc.nextInt());
        apr9_2.I2 obj2 = new I2() {
            public float m2(float b){
                System.out.println("in m2 "+b);
                return sc.nextFloat();
            }
        };
        obj2.m2(sc.nextFloat());
    }
}
