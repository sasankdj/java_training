//cja 1 abstarct class, it contains 1 undefined and 1 defined method and a parameterised constructor then inherit this class into another abstract class which contains 1 abstarct and 1 defined method then inherit this class into a concrete class and provide functionality for them, invoke them by providing dynamic inps  

import java.util.Scanner;

abstract class A{
   static Scanner sc= new Scanner(System.in);
    abstract int m1(int a);
    int m2(int b){
        System.out.println("in m2 "+b);
        return sc.nextInt();
    }
    A(int a){
        System.out.println("in constructor "+ a);
    }
}
abstract class B extends A{
    B(){
        super(sc.nextInt());
    }
    abstract int m3(int a);
    int m4(int a){
        System.out.println("in m4 "+a);
        return sc.nextInt();
    }

}
public class apr1_3 extends B{
    apr1_3(){
        super();
    }
   int m1(int a){
    System.out.println("in m1 "+a);
    return sc.nextInt();
   }
   int m3(int a){
    System.out.println("in m3 "+a);
    return sc.nextInt();
   }
    public static void main(String[] args) {
        apr1_3 obj = new apr1_3();
      System.out.println(obj.m1(sc.nextInt()));  
        System.out.println(obj.m2(sc.nextInt()));
        System.out.println(obj.m3(sc.nextInt()));
        System.out.println(obj.m4(sc.nextInt()));


    }
}
