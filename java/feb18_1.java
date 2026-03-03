import java.util.Scanner;

public class feb18_1 {
    static int a;
    static Scanner sc = new Scanner(System.in);
    static {

        a=sc.nextInt();
    }
    static float f=sc.nextFloat();
    int b=sc.nextInt();
    float c=sc.nextFloat();

    void m1(){
        System.out.println(a);
        System.out.println(f);
        System.out.println(b);
        System.out.println(c);
    }
    void m2(){

        System.out.println(a);
        System.out.println(f);
        System.out.println(b);
        System.out.println(c);
    }
    public static void main(String[] args) {

        System.out.println("enter for m1");

       feb18_1 obj=new feb18_1();
        System.out.println("enter for m2");

       feb18_1 obj1=new feb18_1();
       obj.m1();
       obj1.m2();
    }
}
