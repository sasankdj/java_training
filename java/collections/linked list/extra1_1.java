import java.util.Arrays;
import java.util.LinkedList;

public class extra1_1 {
    public static void main(String[] args) {
        Integer arr[]={10,5,6,11,4,10,6,4,6,11,12,10,6,11,11};
        LinkedList<Integer> ll= new LinkedList<>(Arrays.asList(arr));
        LinkedList<Integer> ll1= new LinkedList<>();
        for (int i = 0; i < ll.size(); i++) {
            int x=ll1.indexOf(ll.get(i));
            if(x==-1){
                ll1.add(ll.get(i));

            }
            else
            {
                ll1.add(x, ll.get(i));
            }
        }
        for (Integer integer : ll1) {
            System.out.print(integer+" ");
        }
        
    }
}
