//Cja where we have 1 class it contains a method having 2 int params then perform division operation on this params if any exception occurs in this process handle it and ivoke this method under main method by providing dynamic inps
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