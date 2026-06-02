public class q3 {
    public static void main(String[] args) {
        int arr1[]={8,7,5,1,5,2,6};
        int arr[]={1,3,4,5};
        int min =Math.min(arr.length, arr1.length);
        for (int i = 0; i < min; i++) {
            System.out.print(arr[i]+arr1[i]+" ");
        }
        if(arr.length>arr1.length){

            for (int i = min; i <arr.length ; i++) {
                System.out.print(arr[i]+" ");
            }
        }
        else{
             for (int i = min; i <arr1.length ; i++) {
                System.out.print(arr1[i]+" ");
            }
        }

    }
}
