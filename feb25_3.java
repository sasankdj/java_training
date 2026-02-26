import java.util.Scanner;

public class feb25_3 {
    static Scanner sc = new Scanner(System.in);
      static {
        System.out.println("Enter non static  int a and float f:");
    }
    static feb25_3 obj = new feb25_3();
  static {
        System.out.println("Enter static int a and float f:");
    }
  

    static int a = sc.nextInt();
    static float f = sc.nextFloat();

    int b = sc.nextInt();
    float c = sc.nextFloat();


    int d1(int a) {
        System.out.println("Inside d1 received: " + a);
        System.out.println("Enter int to return from d1:");
        return sc.nextInt();
    }

    int d2(int b) {
        System.out.println("Inside d2 received: " + b);
        System.out.println("Enter int to return from d2:");
        return sc.nextInt();
    }

    int d3(int c) {
        System.out.println("Inside d3 received: " + c);
        System.out.println("Enter int to return from d3:");
        return sc.nextInt();
    }

    static int m1(int a) {
        System.out.println("Static a = " + feb25_3.a);
        System.out.println("Static f = " + feb25_3.f);
        System.out.println("Instance b = " + obj.b);
        System.out.println("Instance c = " + obj.c);

        System.out.println("Enter int for d1:");
       

        System.out.println(" received from d1: " + obj.d1(sc.nextInt()));
        System.out.println("enter int to return from m1");
        return sc.nextInt();
    }

    static int m2(int b) {
        System.out.println("Static a = " + feb25_3.a);
        System.out.println("Static f = " + feb25_3.f);
        System.out.println("Instance b = " + obj.b);
        System.out.println("Instance c = " + obj.c);

        System.out.println("Enter int for d2:");
        

        System.out.println("m2 received from d2: " + obj.d2(sc.nextInt()));
         System.out.println("enter int to return from m2");
        return sc.nextInt();
    }

    static int m3(int c) {
        System.out.println("Static a = " + feb25_3.a);
        System.out.println("Static f = " + feb25_3.f);
        System.out.println("Instance b = " + obj.b);
        System.out.println("Instance c = " + obj.c);

        System.out.println("Enter int for d3:");
       System.out.println("m3 received from d3: " + obj.d3(sc.nextInt()));
         System.out.println("enter int to return from m3");
        return sc.nextInt();
    }

 
    public static void main(String[] args) {

        System.out.println("Enter value for m1:");
        int r1 = m1(sc.nextInt());

        System.out.println("Enter value for m2:");
        int r2 = m2(sc.nextInt());

        System.out.println("Enter value for m3:");
        int r3 = m3(sc.nextInt());

        System.out.println("Returned values: " + r1 + ", " + r2 + ", " + r3);
    }
}