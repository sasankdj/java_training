//cja 1 abstract class it contains 1 abstarct and 1 defined method and a param constructor then inherit this class into two concrete classes and provide functionality then invoke all these methods under main of seprerate class test

import java.util.Scanner;

abstract class A{
   static Scanner sc= new Scanner(System.in);
    abstract int m1(int a);
    int m2(int a){
        System.out.println("in m2 "+a);
        return sc.nextInt();
    }
    A(int a){
        System.out.println("in constructor" +a);
    }
}
class B extends A{
int m1(int a){
    System.out.println("from the concrete B in m1 "+a);
    return sc.nextInt();
}
B(){
super(sc.nextInt());
}
}
class C extends A{
int m1(int a){
    System.out.println("from the concrete class C in m1 "+a);
    return sc.nextInt();
}
C(){
    super(sc.nextInt());
}
}
public class apr1_4 {
    public static void main(String[] args) {
        B obj = new B();
        C obj1 = new C();
        Scanner sc=obj.sc;
        System.out.println(obj.m1(sc.nextInt()));
        System.out.println(obj.m2(sc.nextInt()));
        System.out.println(obj1.m1(sc.nextInt()));
        System.out.println(obj1.m2(sc.nextInt()));
    }
}
