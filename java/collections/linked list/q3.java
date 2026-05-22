import java.util.LinkedList;
import java.util.ListIterator;

public class q3 {
    public static void main(String[] args) {
        LinkedList<Integer> ll= new LinkedList<>();
        for (int i = 0; i <10; i++) {
            ll.add(i);

        }
        ll.removeFirst();
        ll.removeLast();
        ListIterator<Integer> lr= ll.listIterator();
        while (lr.hasNext()) {
            System.out.print(lr.next()+" ");
        }
    }
}
