import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
         char c=sc.next().charAt(0);
        for (int i = s.length()-1; i>=0;i--) {
            if(s.charAt(i)==c){
           System.out.println(i);
        break;
    }
        }
    }
}
