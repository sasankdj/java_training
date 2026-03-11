import java.util.Scanner;

public class mar10_2 {
    static Scanner sc= new Scanner(System.in);
    int a=10;
    mar10_2(float a){
        System.out.println("in params 1");
        System.out.println(a);
    }
    mar10_2(int a){
        this(sc.nextFloat());
        System.out.println("in params 2");
    }
    public static void main(String[] args) {
        mar10_2 obj = new mar10_2(sc.nextInt());
    }
}
