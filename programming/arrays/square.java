import java.util.Arrays;

public class square {
    public static void main(String[] args) {
        int[] arr = {3,4,2,1,3,5};
        for (int i = 0; i < arr.length; i++) {
            arr[i]=(int)Math.pow(arr[i],(i+1));
            // System.out.print(+" ");
        }
        System.out.println(Arrays.toString(arr));
    }    
}
