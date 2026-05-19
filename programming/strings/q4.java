import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
           System.out.println(Integer.valueOf(s.charAt(i)));
        }
    }
}
