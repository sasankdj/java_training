import java.util.Scanner;

    public class q3 {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       int max=Integer.MIN_VALUE;
       int max2=Integer.MIN_VALUE;
        int arr1[][]= new int[2][2];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j]=sc.nextInt();
            }
        }
        
        // int n=4;
       for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                if(arr1[i][j]>max){
                    max2=max;
                    max=arr1[i][j];
                }
                else if(arr1[i][j]>max2 && arr1[i][j]!=max){
                    max2=arr1[i][j];
                }
            }
       }
System.out.println(max+" "+max2);
    }
    
}