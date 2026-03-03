//create a java application where we have 1 class it contains all types of methods then invoke any 1 of the method under main methods and rest under another methods by provinding dynamic inps
import java.util.Scanner;
public class feb26_3 {
    static Scanner sc = new Scanner(System.in);
   static feb26_3 o= new feb26_3();
    static void m1(){
       System.out.println(m2()); 
        System.out.println("in m1");
    }
    static int m2 (){
        m3(sc.nextInt());
        System.out.println("in m2");
        return sc.nextInt();
    }
    static void m3(int a){
        System.out.println(m4(sc.nextInt()));
        System.out.println("in m3");

        System.out.println(a);

    }
    static int m4(int a){
        o.m5();
        System.out.println("in m4");
        System.out.println(a);
        return sc.nextInt();
    }
    void m5(){
        m6(sc.nextInt());
        System.out.println("in m5");

    }
    void m6(int a){
       System.out.println(m7()); 
        System.out.println("in m6");
        System.out.println(a);
    }
    int m7(){
        System.out.println(m8(sc.nextInt()));
        System.out.println("in m7");
        return sc.nextInt();
    }
    int m8(int a){

        System.out.println("in m8");
        System.out.println(a);
        return sc.nextInt();
    }
    public static void main(String[] args) {
        m1();
    }
}