//cja 1 interface which contains 2 abstract methods 1 defined method inherit this interface into and abstract class which contains 1 abstract method 1 parameterised constructor and inherit this class into a concrete class provide implementation for all abstract methods invoke those props under main method while providing dynamic inps

import java.util.Scanner;

interface i1  {
    Scanner sc= new Scanner(System.in);
    int m1(int a);
    float m2(float b);
    default int m3(int c){
        System.out.println("in m3 "+c);
        return sc.nextInt();
    }
}
abstract class  ab1 implements i1{
    abstract int m4(int a);
    ab1(int a){
        System.out.println("in param constuct "+a);
    }
}
public class apr4_2 extends ab1{
    public int m1(int a){
        System.out.println("in m1 "+a);
        return sc.nextInt();
    }
    public float m2(float b){
        System.out.println("in m2 "+b);
        return sc.nextFloat();
    }
    int m4(int a){
        System.out.println("in m3");
        return sc.nextInt();
    }
    apr4_2(){
        super(sc.nextInt());
    }
 public static void main(String[] args) {
    i1 obj = new apr4_2(); //upcasting 
    obj.m1(sc.nextInt());
    obj.m2(sc.nextFloat());
    obj.m3(sc.nextInt());
    apr4_2 obj1 = (apr4_2)obj; //downcasting
    obj1.m4(sc.nextInt());
    
 }   
}
