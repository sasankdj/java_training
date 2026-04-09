//cja 1 abstract class it contains 1 params construct, 1 abstract and 1 defined method and we have and interface which contains 1 abstract and 1 defined method then provide functionality for this properties without using extends or implements keyword 

import java.util.Scanner;

abstract class A{
    static Scanner sc= new Scanner(System.in);
    A(int a){
        System.out.println("in params constrcut "+a);
    }
    abstract int m1(int a);
    int m2(int b){
        System.out.println("in m1 "+b);
        return sc.nextInt();
    }

}
interface B{
    Scanner sc= A.sc;
    int m3(int a);
   default int m4(int a){
        System.out.println("in m3 "+a);
        return sc.nextInt();
    }
}
public class apr8_2 {

    public static void main(String[] args) {
        Scanner sc= A.sc;
        A obj = new A(sc.nextInt()) {
            int m1(int a){
                System.out.println("in m1 "+a);
                return sc.nextInt();
            }
        };
        B obj2 = new B() {
            public int m3(int a){
                System.out.println("in m4 "+a);
                return sc.nextInt();
            }
        };
        System.out.println(obj.m1(sc.nextInt()));
        System.out.println(obj.m2(sc.nextInt()));
        System.out.println(obj2.m3(sc.nextInt()));
        System.out.println(obj2.m4(sc.nextInt()));
    }
}