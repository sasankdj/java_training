import java.util.ArrayList;
import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            al.add(sc.nextInt());
        }
          for (Integer i : al) {
            System.out.print(i+" ");
        }
    }
}
