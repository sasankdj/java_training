
import java.util.Scanner;

public class p4 {
    int a;
    String b;
    p4(int a , String b){
        this.a=a;
        this.b=b;
    }
    void m1(){
      System.out.println(a);
      System.out.println(b);
    }

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    p4 obj = new p4(sc.nextInt(), sc.next());
    obj.m1();
}    
}
