import java.util.Arrays;

public class q8 {
    public static void main(String[] args) {
        int arr[][] =  {{1,2,3},{3,5,4},{4,5,6}};
        int s=0,e=arr.length-1;

    //    while (s<e) {
    //     int[]temp=arr[s];
    //     arr[s]=arr[e];
    //     arr[e]=temp;

    //     s++;
    //     e--;
    //    }
    //    System.out.println(Arrays.deepToString(arr));

    for (int  i = arr.length-1; i>=0;i--) {
        for (int j = 0; j < arr.length; j++) {
            
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
    }
}
