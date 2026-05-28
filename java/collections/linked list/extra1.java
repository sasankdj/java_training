import java.util.Arrays;
import java.util.LinkedList;

public class extra1 {
    public static void main(String[] args) {
        Integer arr[]={10,5,6,11,4,10,6,4,6,11,12,10,6,11,11};
        LinkedList<Integer> ll= new LinkedList<>(Arrays.asList(arr));
       for (int i = 0; i < ll.size(); i++) {
        int fc=0;
        for (int j = 0; j < ll.size(); j++) {
            if(ll.get(i).equals(ll.get(j))){
                fc++;
                // ll.remove(j);
            }
        }
        for (int j = 0; j < i; j++) {
            if (ll.get(i)==ll.get(j)) {
                fc=-1;
            }
        }
        if(fc>0){

            for (int j = 0; j <fc; j++) {
                System.out.print(ll.get(i)+" ");
            }
        }

       }
//same question is there in effective way in next file
    }
}
