import java.util.Arrays;

public class reverse {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        // int mid=arr.length/2;
        // int end=arr.length;
        // for(int i=0;i<mid;i++){
        //         arr[i]=arr[i]+arr[end-i-1]-(arr[end-i-1]=arr[i]);
        // }
        int mid=arr.length/2;
        int l=arr.length;
        for (int i = 0; i <mid; i++) {
            arr[i]=arr[i]+arr[l-i-1]-(arr[l-i-1]=arr[i]);
        }
        System.out.println(Arrays.toString(arr));
    }
}
