//Cja where we have 1 interface which contains 2 abstract methods having params ans ret type inherit this interface into a concrete class provide functionality for abstract methods invoke them under main method by providing dynamic inps
import java.util.Scanner;

interface i1{
    static Scanner sc = new Scanner(System.in);
    int m1(int a);
     int m2(int a);
}
public class apr3_1 implements i1 {
   public int m1(int a){
        System.out.println("in interface method 1 "+a);
        return sc.nextInt(); 
    }
     public int m2(int a){
        System.out.println("in interface method 1 "+a);
        return sc.nextInt(); 
    }
    public static void main(String[] args) {
        apr3_1 obj = new apr3_1();
        obj.m1(sc.nextInt());
        obj.m2(sc.nextInt());
    }
    
}
