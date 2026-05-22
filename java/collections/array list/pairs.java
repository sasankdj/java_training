import java.util.ArrayList;
import java.util.Arrays;

public class pairs {
    public static void main(String[] args) {
        ArrayList<Integer> al1= new ArrayList<>();
        ArrayList<Integer> al2= new ArrayList<>();

        Integer arr[]={10,8,9,10,11,8,5,4,5,5};
        Integer arr1[]={12,14,10,9,8,10,10,15,5};
        al1.addAll(Arrays.asList(arr));
        al2.addAll(Arrays.asList(arr1));

        for (int i = 0; i <al1.size(); i++) {
            if(al2.contains(al1.get(i))){
                System.out.print(al1.get(i)+" ");
                // al2.set(al2.indexOf(al1.get(i)), -1);
                al2.remove(al1.get(i));
            }
        }

    }
}
