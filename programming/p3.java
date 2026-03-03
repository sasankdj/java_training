import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num1=sc.nextInt();
        int num2= sc.nextInt();
        int num3=sc.nextInt();
        if(num1==num2&&num2==num3)
            System.out.println("all are equal");
        else if(num1>num2 && num1>num3)
            System.out.println("num1 is big");
        else if(num2>num3 && num2>num1)
            System.out.println("num2 is big");
        else if(num3>num2 && num3 >num1)
            System.out.println("num3 is big");
        else if(num1==num2&& num1>num3)
            System.out.println("num1 and 2 are big");
        else if(num2==num3 && num2>num1)
            System.out.println("num2 and 3 are big");
        else
            System.out.println("num1 and 3 are big");
    }
}
