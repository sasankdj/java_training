import java.util.Arrays;

class bubblesort{
    public static void main(String[] args) {
        int[] arr ={10,9,8,7,6,5,4,3,2,1};
        boolean b= true;
        for (int i = 0; b; i++) {
            b=false;
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    arr[j]=arr[j]+arr[j+1]-(arr[j+1]=arr[j]);
                    b=true;

                }
            }
        }
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i]);
        // }
        for(int a:arr){
            System.out.print(a+" ");
        }
        // System.out.println(Arrays.toString(arr));
    }
}