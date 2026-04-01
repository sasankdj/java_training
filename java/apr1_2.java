//cja where we have 1 abstract class it contains 2 undefiend and 2 defined methods, 1 parametreized constructor then inherit this class into a concrete class and provide functionality for them, thvoke them by providing dynamic inps

import java.util.Scanner;

abstract class A{
    abstract int m1(int a);
    abstract int m2(int b);
    void m3(){
        System.out.println("in m3");
    }
    void m4(){
        System.out.println("in m4");
    }
    A(int a){
        System.out.println("the value of a is: "+a);
    }
}

public class apr1_2 extends A{
    apr1_2(int a) {
        
        super(a);
    }
    static Scanner sc= new Scanner(System.in);
    
    int m1(int a){
        System.out.println("from m1 "+a);
        return sc.nextInt();
    }
    int m2(int b){
        System.out.println("from m2 " +b);
        return sc.nextInt();
    }
    public static void main(String[] args) {
        apr1_2 obj = new apr1_2(sc.nextInt());
        System.out.println(obj.m1(sc.nextInt()));
        System.out.println(obj.m2(sc.nextInt()));
        
    }

    
}
