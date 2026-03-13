import java.util.Scanner;

class A{
   static Scanner sc= new Scanner(System.in);
    int a=sc.nextInt();
    static int m1(int a){
        System.out.println(a);
        return sc.nextInt();
    }
    int m2(float a){
        System.out.println(a);
        return sc.nextInt();
    }

}
class mar12_1 extends A{
    int a=sc.nextInt();
    void m3(){
        System.out.println(" in 2nd class");
    }
public static void main(String[] args) {
    mar12_1 obj = new mar12_1();
    obj.m3();
    System.out.println(A.m1(sc.nextInt()));
    System.out.println(obj.m2(sc.nextInt()));
    System.out.println("global var of clasa A "+obj.a);
    System.out.println("global var of derived class "+obj.a);
  

}
}