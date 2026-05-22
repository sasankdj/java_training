// requests

import java.util.ArrayList;
import java.util.Arrays;

public class may16_2 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>(Arrays.asList("i1","i2","i3","i1","i2","i3"));
        ArrayList<String> al1 = new ArrayList<>();
        
        int k=3;
        for (int i = 0; k>0; i++) {
            if(!al1.contains(al.get(i))){
                al1.add(al.get(i)); 
                k--;
            }
        }
        System.out.println(al1);
    }
}
