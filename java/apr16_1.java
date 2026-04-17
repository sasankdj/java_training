//cja where we need to handle string index out of bound exception
//cja where we need to handle null pointer exception
import java.util.Scanner;

public class apr16_1{
    static void m1(int a,int b){
        try {
            b=a/b;
            System.out.print(b);
            
        } catch (ArithmeticException e) {
            System.out.println("exception raised"+e);
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        m1(sc.nextInt(), sc.nextInt());
    }
}