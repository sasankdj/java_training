import java.util.Arrays;
import java.util.Scanner;

public class exam1 {
    public static void frequency(int arr[]){
        int fr[]= new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int fc=0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i]==arr[j]) {
                    fc++;
                }
            }
            fr[i]=fc;
        }

        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length-1; i++) {
                if(fr[i]<fr[i+1] || fr[i]==fr[i+1] && arr[i]>arr[i+1]){
                    fr[i]=fr[i]+fr[i+1]-(fr[i+1]=fr[i]);
                    arr[i]=arr[i]+arr[i+1]-(arr[i+1]=arr[i]);

                }
            }
        }
        for (int i = 0; i < fr.length; i++) {
            int fc=0;
            for (int j = i; j <arr.length; j++) {
                if(arr[i]==arr[j]){

                    fc++;
                    
                }
            }
            if(fc==1){
                System.out.print(arr[i]+"  "+fr[i]);
                System.out.println();
            }
        }
        // System.out.println(Arrays.toString(arr));
        // System.out.println(Arrays.toString(fr));
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        if(n>5){

            int arr[]= new int[n];
            for (int i = 0; i <n; i++) {
                arr[i]=sc.nextInt();
            }
            frequency(arr);
        }
        else
            System.out.println("Invalid Input");
        
    }
}