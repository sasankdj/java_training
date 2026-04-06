// CJA where we have two interfaces that contain one abstract method and one defined method in each interface, then inherit these interfaces into another interface which contains two abstract methods, then inherit this interface into a concrete class, provide implementation for abstract methods and invoke all the properties under the main method by using upcasting using dynamic inputs

import java.util.Scanner;

interface i1{
    Scanner sc= new Scanner(System.in);
    int m1(int a);
    default int m2(int b){
        System.out.println("in m2 "+b);
        return sc.nextInt();
    }

}
interface i2 {
     int m3(int a);
    default int  m4(int b){
        System.out.println("in m4 "+b);
        return i1.sc.nextInt();
    }
}
interface i3 extends i1,i2  {
    int m5(int a);
    int m6(int a);
}
public class apr6_1 implements i3{
    public int m1(int a){
        System.out.println("in m1 "+a);
        return sc.nextInt();
    }
    public int m3(int a)
{
    System.out.println("in m3 "+a);
    return sc.nextInt();
}
public int m5(int a){
    System.out.println("in m5 "+a);
    return sc.nextInt();
}    
public int m6(int a){
    System.out.println("in m6 "+a);
    return sc.nextInt();
}
public static void main(String[] args) {
        // apr6_1 obj = new apr6_1();
        i1 obj = new apr6_1();
        obj.m1(sc.nextInt());
        obj.m2(sc.nextInt());
        i2 obj1= (i2)obj;
        obj1.m3(sc.nextInt());
        obj1.m4(sc.nextInt());
        i3 obj2= (i3)obj;
        obj2.m5(sc.nextInt());
        obj2.m6(sc.nextInt());


    }
}