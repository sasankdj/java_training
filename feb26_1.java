//create a java application where we have one class it contains two static and two instance variables,3 non static methods and 3 static methods having parameter and return type then invok non static methods under static methods one each and print all the variables under all the static methods, invok static methods under main method by providing dynamic inputs.

import java.util.Scanner;

public class feb26_1 {
    static Scanner sc= new Scanner(System.in);
    static int a=sc.nextInt();
    static float b = sc.nextFloat();
    int c=sc.nextInt();
    float d=sc.nextFloat();
    int m1(int a ){
        System.out.println(a);
        return sc.nextInt();
    }
    int m2(int a ){
        System.out.println(a);
        return sc.nextInt();
    }int m3(int a ){
        System.out.println(a);
        return sc.nextInt();
    }
    static int m4(int a){
        System.out.println(a);
        System.out.println(feb26_1.a+" "+feb26_1.b);     
        System.out.println(new feb26_1().m1(sc.nextInt()));   
        System.out.println(new feb26_1().c);
        System.out.println(new feb26_1().d);
        return sc.nextInt();

    }
    static int m5(int a){
        System.out.println(a);
        System.out.println(feb26_1.a+" "+feb26_1.b);     
        System.out.println(new feb26_1().m2(sc.nextInt()));   
        System.out.println(new feb26_1().c);
        System.out.println(new feb26_1().d);
        return sc.nextInt();

    }static int m6(int a){
        System.out.println(a);
        System.out.println(feb26_1.a+" "+feb26_1.b);     
        System.out.println(new feb26_1().m3(sc.nextInt()));   
        System.out.println(new feb26_1().c +""+new feb26_1().d);
      
        return sc.nextInt();

    }
    public static void main(String[] args) {
        
    }
}
