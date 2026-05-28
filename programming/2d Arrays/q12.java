import java.util.Arrays;

public class q12 {
    public static void main(String[] args) {
        int[][] arr = {
                { 5, 2, 9 },
                { 1, 8, 3 },
                { 7, 4, 6 }
        };
        int a[]= new int[arr.length*arr[0].length];
        int ind=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                a[ind++]=arr[i][j];    
            }
        }
        Arrays.sort(arr);
        ind=0;
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i++]+" ");
            if(ind==arr.length-1){
                System.out.println();
            }
        }
    }
}
