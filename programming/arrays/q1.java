import java.util.Arrays;

public class q1 {
    public static void main(String[] args) {
        int arr[]={8,7,5,1,5,2,6};
        for (int i = 0; i < arr.length-1; i+=2) {
            arr[i]=arr[i]+arr[i+1]-(arr[i+1]=arr[i]);

        }
       System.out.println(Arrays.toString(arr)); 
    }
}
