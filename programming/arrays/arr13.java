public class arr13 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int arr1[]= {5,6,7,8,9,10};
        int min=Math.min(arr.length,arr1.length);

        for (int i = 0; i < min; i++) {
            System.out.print(arr[i]+arr1[i]+"  ");
           
        }
         if(min+1>arr.length){
                for (int i = min; i < arr1.length; i++) {
                    System.out.print(arr1[i]+" ");
                }
            }
            else{
                for (int i = min; i < arr.length; i++) {
                    System.out.print(arr[i]+" ");
                }
            }
            
    }
}
