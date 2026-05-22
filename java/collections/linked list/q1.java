import java.util.LinkedList;
import java.util.ListIterator;

public class q1 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        // ll.add(null)''
        for (int i = 0; i < 6; i++) {
            ll.add(i);
        }
        ll.remove(2);
        ll.add(2, 10);
        ll.set(3, 20);

        // ll.pop();
        // ll.poll()
        // ll.push(i);
        // ll.peek()
        
        ListIterator<Integer> lr = ll.listIterator();
        while (lr.hasNext()) {
            System.out.print(lr.next()+" ");
        }
        while (lr.hasPrevious()) {
            System.out.print(lr.hasPrevious());
        }

    }
}
