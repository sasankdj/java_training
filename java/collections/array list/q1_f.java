import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class q1_f{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            al.add(sc.nextInt());
        }
        // for (Integer i : al) {
        //     System.out.print(i+" ");
        // }

        // for (int i = 0; i < al.size(); i++) {
        //     System.out.print(al.get(i));
        // }
        
        // while (!al.isEmpty()) {
        //     System.out.print(al.remove(0));
        // }

        // al.forEach((x)->System.out.print(x));

        Iterator <Integer> it = al.iterator();
        while (it.hasNext()) {
            System.out.print(it.next());
        }

    }
}