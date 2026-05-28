
public class e4 {
    public static void main(String[] args) {
        // int sum=0;
        // int arr[] = {1,2,3,4};
        // for (int i = 0; i < arr.length; i++) {
        //     sum+=arr[i];
        // }
        // for (String i : args) {
            try {
                
                Integer.parseInt(args[0]);
            } catch (Exception e) {
              System.out.println(e);
            }
        // }
        // System.out.println(sum);
    }    
}
