import java.util.ArrayList;
import java.util.Iterator;

public class q3 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < 101; i++) {
            al.add(i);
        }

        Iterator<Integer> it =al.iterator();

        // while (it.hasNext()) {
        //     int a=it.next();
        //     if(a%2==0)
        //     System.out.print(a+" ");
            
        // }

        while(it.hasNext()){
            System.out.print(it.next()+" ");
            if(it.hasNext())
                it.next();
        }
    }
}
