import java.util.Scanner;

abstract class A{
    abstract void m1(int a);
    void m4(){
        System.out.println("in m4");
    }
}
abstract class B extends A{
abstract void m2(int b);
}
abstract class C extends B{
abstract void m3(int c);
}
public class apr2_1 extends C{
    void m1(int a){
        System.out.println("in m1"+a);
    }
    void m2(int b){
        System.out.println("in m2"+b);
    }
    void m3(int c){
        System.out.println("in m3"+c);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // A obj=new apr2_1();
        // B obj1 = new apr2_1();
        // C obj3= new apr2_1();

        // apr2_1 obj = new apr2_1();
        // A obj1=obj;
        // B obj2= obj;
        // C obj3=obj; //upcasting ...

        A obj = new apr2_1();
        B obj2=(apr2_1)obj; //downcasting
        obj1.m1(sc.nextInt());
        obj2.m2(sc.nextInt());
        obj3.m3(sc.nextInt());
        obj.m4();
    }
}
