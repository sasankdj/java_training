
import java.util.LinkedList;

public class q4 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        for (int i = 0; i <10; i++) {
            ll.push(i);
        }
         for (Integer integer : ll) {
            System.out.print(integer+" ");
        }
        System.out.println();
        for (int i = 0; i < ll.size(); i++) {
            for (int j = i+1; j < ll.size(); j++) {
                if(ll.get(i)>ll.get(j)){
                    Integer temp=ll.get(i);
                ll.set(i, ll.get(j));
                ll.set(j, temp);
            }

            }
        }
        for (Integer integer : ll) {
            System.out.print(integer+" ");
        }
    }
}
