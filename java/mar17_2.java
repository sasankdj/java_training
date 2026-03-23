//cja satisfy this and super at all levels 

import java.util.Scanner;

class A{
    static Scanner sc= new Scanner(System.in);
    int a=sc.nextInt();
    int m1(int a){
        return sc.nextInt();
    }
    A(int a){
        System.out.println(a);
    }
}
public class mar17_2 extends A{
    int a=sc.nextInt();
    mar17_2(int a){
        super(sc.nextInt());
        System.out.println(this.a);

        System.out.println(a);
    }
    int m1(int a){
        super.m1(sc.nextInt());
        System.out.println(a);
        System.out.println(this.a);
        return sc.nextInt();
    }
    int m2(int a){
        return sc.nextInt();
    }


    public static void main(String[] args) {
        
    }    
}
