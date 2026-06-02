public class q2 {
    public static void main(String[] args) {
        int arr[]={8,7,5,1,5,2,6};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]+arr[j]==3){
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }
    }
}
