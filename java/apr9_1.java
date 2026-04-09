//cja 1 interface 1 abstract method and an inner interface which contains 1 abstract method then provide functionality for this and invoke them by providing dynamic inps

import java.util.Scanner;

interface I1{
    Scanner sc= new Scanner(System.in);
    int m1(int a);
    interface I2{
        float m2(float a);
    }
}
public class apr9_1 implements I1,I1.I2{
    public int m1(int a){
     System.out.println("in m1 "+a);
     return sc.nextInt();
    }
    public float m2(float a){
        System.out.println("in m2 "+a);
        return sc.nextFloat();
    }
    public static void main(String[] args) {
        apr9_1 obj = new apr9_1();
        obj.m1(sc.nextInt());
        obj.m2(sc.nextFloat());
    }
}
