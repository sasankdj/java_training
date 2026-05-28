import java.util.Arrays;

public class q15 {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{5,6,7}};
        int arr1[][]=new int [arr.length][arr.length+1];
        for (int i = 0; i < arr1.length; i++) {
            int sum=0;
            for (int j = 0; j < arr1[0].length; j++) {
                if(j<arr[0].length){

                    arr1[i][j]=arr[i][j];
                    sum+=arr[i][j];
                }
                else
                    arr1[i][j]=sum;
            }
        }
        for (int[] is : arr1) {
            System.out.println(Arrays.toString(is));
        }


    }
}
