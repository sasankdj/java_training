import java.util.PriorityQueue;

public class may4_1 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        for (int i = 0; i <10; i++) {
            // pq.add(i);   // throws exception when the capacity exceeds 11
            pq.offer(i);    // expands the capacity by *2+2;
        }
        
        // System.out.println(pq.peek());      //doesnt raise exception
        System.out.println(pq.element());       //raises exception when there were no elements
        while (!pq.isEmpty()) {
            System.out.print(pq.poll());     //doesnt raise exception
            // System.out.print(pq.remove());    //raises exception when there were no elements
        }


    }    
}
