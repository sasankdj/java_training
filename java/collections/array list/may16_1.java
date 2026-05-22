//game


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class may16_1 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        int c=0,p1=0,p2=0;
        while (!al.isEmpty()) {
            int x=al.remove(0);
            if(c%2==1){
                p2+=x;
            }
            else{
                p1+=x;
            }
            c++;
            if(x%2==0){
                Collections.reverse(al);
            }
        }
        System.out.println(Math.abs(p2-p1));
    }
}
