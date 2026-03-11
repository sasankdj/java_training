//Cja where we need to satisfy this keyword at variable and method level.
import java.util.Scanner;

class mar10_1{
    static Scanner sc= new Scanner(System.in);
    String a = sc.next();
        int m1(int a){
            System.out.println(this.a);
            return sc.nextInt();
        }
        int m2(int a){
            System.out.println(a);
           System.out.println(this.m1(a));
           return sc.nextInt();
        }
    public static void main(String[] args) {
        mar10_1 obj = new mar10_1();
        System.out.println(obj.m2(sc.nextInt()));
    }
}