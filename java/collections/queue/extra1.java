import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class extra1 {
    public static void main(String[] args) {
       PriorityQueue <Integer> pq= new PriorityQueue<>(Comparator.reverseOrder());
    int arr[]= {10,5,6,11,17,19,4,6,20,11};
    //    int n1,n2,n3=0;
    //     for (int i = 0; i < arr.length-2; i++) {
    //         n1=arr[i];
    //         n2=arr[i+1];
    //         n3=arr[i+2];
    //         int max=Math.max(n1,Math.max(n2, n3));
    //         System.out.print(max+" ");
    //         // ad.offer(max);

    //     }
        // while (!ad.isEmpty()) {
        //     System.out.print(ad.poll());
        // }

    // // **2nd method    
    //     for (int i = 0; i < arr.length-2; i++) {
    //         pq.add(arr[i]);
    //         pq.add(arr[i+1]);
    //         pq.add(arr[i+2]);
    //         System.out.print(pq.peek()+" ");
    //         pq.clear();

    //     }



    //3rd method with  dunamic k
int k=3;
    for (int i = 0; i < k-1; i++) {
        pq.add(arr[i]);
    }
    for (int i = k-1; i < arr.length; i++) {
        pq.add(arr[i]);
        System.out.print(pq.peek()+" ");
        pq.remove(arr[i-k+1]);          //imp is using remove here so it removes the index if we use poll it h=bhecves like queue
    }
    }    




}
