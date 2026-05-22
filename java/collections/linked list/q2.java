import java.util.LinkedList;

public class q2 {

    public static void main(String[] args) {
        LinkedList<Integer> ll= new LinkedList<>();
        for (int i = 0; i <5; i++) {
            // ll.push(i);
            ll.add(i);

        } 
        ll.remove(ll.size()/2);

        for (Integer integer : ll) {
            System.out.print(integer+" ");
        }
    }
}