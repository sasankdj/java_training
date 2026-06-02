import java.util.Scanner;

public class instacks1 {
    static void pairs(int[] arr){
        
        for (int i = 0; i < arr.length; i++) {
            int fc=0;
            for (int j = 0; j <=i; j++) {
                if(arr[i]==arr[j])
                fc++;
            }
            if(fc%2==0){
                System.out.println(arr[i]+" "+arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }

        pairs(arr);
    }
}
