import java.util.Scanner;

public class may21_1 {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
        int arr1[][]= new int[2][2];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j]=sc.nextInt();
            }
        }
        
        int n=4;
       for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                if(arr1[i][j]==n){

                    // System.out.println(arr1[i][j]+" "+i+" "+j);
                    System.out.println("found");
                    return;
                }
            }
       }
System.out.println("not found");
    }
    
}