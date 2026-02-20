//create a java application where we have 1 class it contains 1 instance var, 2 static and 2 non static methods having params and ret type then invoke non stctic methods under static methods 1 each and static methods under main method by providing dynamic inps
import java.util.Scanner;
class feb20_1{
    static Scanner sc = new Scanner(System.in);
    int i =200;
    static feb20_1 obj = new feb20_1();
    int m1(int a ){
        System.out.println(a);
        System.out.println("enter a int val to return from m1");
        return sc.nextInt();
    }
    float m2(int b ){
        System.out.println(b);
        System.out.println("enter a float val to return from m2");
        return sc.nextFloat();
    }
    static int m3(int c){
        System.out.println(c);
        System.out.println("enter a int to pass in m1");
        obj.m1(sc.nextInt());
        System.out.println("enter a int val to return from m3");
        return sc.nextInt();
    }
    static float m4(int d){
        System.out.println(d);
        System.out.println("enter a int to pass in m2");
        obj.m2(sc.nextInt());
        System.out.println("enter a float val to return from m4");
        return sc.nextFloat();
    }
public static void main(String[] args) {
    System.out.println(obj.i);
    System.out.println("enter a int for m3");
    System.out.println(m3(sc.nextInt()));
    System.out.println("enter a int for m4");
    System.out.println(m4(sc.nextInt()));
}
}