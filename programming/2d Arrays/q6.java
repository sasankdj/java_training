

public class q6 {
    public static void main(String[] args) {
        int arr[][]={{2,3,4},{2,3,4},{6,7,8}};
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(i==j){
                    if(arr[i][j]>max){
                        max=arr[i][j];
                    }
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(i==j){
                   arr[i][j]=max;
                }
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    //    System.out.println(Arrays.toString(arr)); 

    }
}
