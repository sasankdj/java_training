//Cja where we need to statisfy  both overloading and overriding
import java.util.Scanner;

class A{
    Scanner sc= new Scanner(System.in);
    int m1(int a){
        System.out.println(a);
        return sc.nextInt();
    }
    int m2(int a,int b){
        System.out.println(a+" "+b);
        return a+b;
    }
   

}
class mar28_1 extends A{
    int m1(int a){
        System.out.println("in overriden class");
        System.out.println(super.m1(sc.nextInt()));
        return sc.nextInt();
    }
    public static void main(String[] args) {
         mar28_1 obj=new mar28_1();
      
       System.out.println(obj.m1(obj.sc.nextInt())); 
       System.out.println(obj.m2(obj.sc.nextInt(), obj.sc.nextInt())); 
        
        
    }
}