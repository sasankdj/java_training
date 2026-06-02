import java.util.Arrays;

public class circularshirft {
    public static void main(String[] args) {
        int arr[]= {1,2,3};
        for (int j= 0; j< 1;j++) {
            
            int e=arr[arr.length-1];
            for (int i = arr.length-1; i >0; i--) {
                arr[i]=arr[i-1];
            }
            arr[0]=e;
        }
      System.out.println(Arrays.toString(arr));  
    }
}
