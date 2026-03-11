import java.util.Scanner;

public class p5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        if (num > -1 && num < 101) {
            if (num > 90 && num <= 100) {
                System.out.println("super smart");
            } else if (num > 80 && num <= 90) {
                System.out.println("smart");
            } else if (num > 70 && num <= 80) {
                System.out.println("smart enough");
            } else if (num > 60 && num <= 70)
                System.out.println("just smart");
            else if (num > 35 && num <= 60)
                System.out.println("no smart");
            else
                System.out.println("dump");
        }

        else
            System.err.println("invalid valid");
    }
}
