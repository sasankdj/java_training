import java.util.Arrays;

public class q50 {
    public static void main(String[] args) {
         String s="sasank";
        char arr[]=s.toCharArray();
        Arrays.sort(arr);
        
        System.out.println(Arrays.toString(arr));
        System.out.println(new String(arr));
    }
}
