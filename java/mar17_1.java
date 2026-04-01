//this and super at all levels
import java.util.Scanner;

class A{
    static Scanner sc= new Scanner(System.in);
    int a=sc.nextInt();
    A(int a){
        System.out.println("in param constaruct"+a);
    }
    int m1(int a){
        System.out.println(a);
        return sc.nextInt();
    }

}

class mar17_1 extends A{
    
    int a=sc.nextInt();
    mar17_1(int a) {
        super(sc.nextInt());
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(super.a);
    }
    int m1(int a){
        System.out.println(a);
       System.out.println(super.m1(sc.nextInt()));   
        return sc.nextInt();
    }
      
    public static void main(String[] args) {
        mar17_1 obj = new mar17_1(sc.nextInt());
        obj.m1(sc.nextInt());
    }
}