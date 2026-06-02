public class q4 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int max=Integer.MIN_VALUE;
        int max2=max;
        int max3=max;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max3=max2;
                max2=max;
                max=arr[i];
            }
            else if(arr[i]>max2 && arr[i]!=max){
                max3=max2;
                max2=arr[i];
            }
            else if(arr[i]>max3 && arr[i]!=max && arr[i]!=max2){
                max3=arr[i];
            }
        }
        System.out.println(max +" "+max2+" "+max3+" ");
    }
}
