//cja where we have 1 interface which contain 1 abstarct method and 1 defined method inherit this interface into a concrete class provide implementation and invoke those props under main method

import java.util.Scanner;

interface i1 {
    Scanner sc= new Scanner(System.in);
    int m1(int a);
    static int m2(int b)   //static - static, default - non static
    {
        System.out.println("in m2 "+b);
        return sc.nextInt();

    }
}
 public class apr4_1 implements i1{
    
    public int m1(int a){
        System.out.println("in m1 "+a);
        return sc.nextInt();
    }
    public static void main(String[] args) {
        i1 obj = new apr4_1();
        System.out.println(obj.m1(sc.nextInt()));
        System.out.println(i1.m2(sc.nextInt()));
    }
}
