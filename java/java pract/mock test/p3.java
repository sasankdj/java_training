import java.util.Scanner;

public class p3 {
static Scanner sc= new Scanner(System.in);
    p3(int a, float b, String c){
        System.out.println(a+" "+b+" "+c);
    }
    p3(float a, double b){
        this(sc.nextInt(), sc.nextFloat(), sc.next());
        System.out.println(a+" "+b);
    }
    p3(byte a){
        this(sc.nextFloat(), sc.nextDouble());
        System.out.println(a);

    }
    p3(){
        this(sc.nextByte());
    }
    public static void main(String[] args) {
        new p3();

    }
}
