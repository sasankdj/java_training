import java.util.Scanner;

public class p3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        if (num1 == num2 && num2 == num3)
            System.out.println("all are equal");

        if (num1 >= num2 && num1 >= num3) {
            if (num1==num2) {
                System.out.println("num1 and 2 are equal big");
            }
            if(num1==num3){
                System.out.println("num1 and 3 are equal big");
            }
          
            else
                System.out.println(" num1 is big");

        }
          if(num2>=num3)
    }
}
