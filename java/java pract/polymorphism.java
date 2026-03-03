import java.util.Scanner;

public class polymorphism {
    void m1(int a){
        System.out.println(a);
    }
    void m1(float f ){
        System.out.println(f);
    }
    int m1(int a ,int b){
        System.out.println(a+","+b);
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        polymorphism obj = new polymorphism();
        System.out.println(obj.m1(sc.nextInt(),sc.nextInt()));
        sc.close();
    }
}
