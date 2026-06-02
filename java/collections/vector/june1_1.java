import java.util.Enumeration;
import java.util.Vector;

public class june1_1 {
    public static void main(String[] args) {
        Vector<Integer> v= new Vector<>();
        v.addElement(1);
        v.addElement(2);
        for (Integer integer : v) {
            System.out.println(integer);
        }
        // Enumeration<Integer> e= v.elements();
        // while (e.hasMoreElements()) {
        //     System.out.println(e.nextElement());
        // }
    }
    
}