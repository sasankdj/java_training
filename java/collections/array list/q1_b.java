import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class q1_b {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();
        for (int index = 0; index < 6; index++) {
            
            al.add(sc.nextInt());
        }
        al.remove(new Integer(10));
        System.out.println(al);

        al.add(30);
        System.out.println(al);

        al.set(3, 50);
        System.out.println(al);

        
    }
}
