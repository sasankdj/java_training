import java.util.ArrayList;
import java.util.Scanner;

public class q2 {
   public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();
        for (int index = 0; index < 6; index++) {
            
            al.add(sc.nextInt());
        }
        System.out.println(al);
    }
}
