import java.util.Scanner;

public class p1 {
    static Scanner sc= new Scanner(System.in);
    p1(){

    }
    p1(int a){
        this();
    }
    static int m1(int a){
        return sc.nextInt();
    }
    static float m2(int a){
        return sc.nextFloat();
    }
    int m3(int a){
        return sc.nextInt();
    }
    float m4(int a){
        return sc.nextFloat();
    }
    public static void main(String[] args) {
        p1 obj = new p1(sc.nextInt());
        System.out.println(obj.m3(sc.nextInt()));
        System.out.println(obj.m4(sc.nextInt()));
        System.out.println(p1.m1(sc.nextInt()));
        System.out.println(p1.m2(sc.nextInt()));
    }
}
