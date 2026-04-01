//Cja 1 abstract class which contains 2 undefined methods then inherit this class into a concrete class and provide functionality for them, invoke them by providing dynamic inps 
import java.util.Scanner;

abstract class A{
    abstract void m1(int a);
    abstract void m2(float b);
}
public class apr_1 extends A {
    void m1(int a){
        System.out.println("in concrete class " +a);
    }
    void m2(float b){
        System.out.println("in m2 concrete class  "+b);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        apr_1 obj = new apr_1();
        obj.m1(sc.nextInt());
        obj.m2(sc.nextFloat());
    }
}
