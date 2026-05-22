import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class q2 {
   public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();
        for (int index = 0; index < 6; index++) {
            
            al.add(sc.nextInt());
        }
        ListIterator<Integer> li=  al.listIterator();
        while (li.hasNext()) {
            System.out.print(li.next()+" ");
        }
        System.out.println();
        while (li.hasPrevious()) {
            System.out.print(li.previous()+" ");
        }
    }
}
