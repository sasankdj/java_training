import java.util.Arrays;
import java.util.Scanner;

public class email {
    static boolean vali(String e){
        if(!e.contains("@") || e.isEmpty() || e.endsWith("."))
            return false;
         String arr[]=e.split("@");
        String arr1[]=arr[1].split("\\.");
        if(arr[0].startsWith("."))
            return false;
        for (int i = 0; i < arr1[0].length(); i++) {
            char c=arr1[0].charAt(i);
            if(!Character.isLetter(c)){

                return false;
            }
        }
        for (int i = 0; i < arr1[1].length(); i++) {
            char c=arr1[1].charAt(i);
            if(!Character.isLetter(c)){

                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String e=sc.nextLine();
       if(vali(e)){
        System.out.println("email is valid");

       }
       else
        System.out.println("email is not valid");
        // System.out.println(Arrays.toString(arr1));
    }
}
