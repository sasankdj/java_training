import java.util.Arrays;

public class q54 {
    public static void main(String[] args) {
         String s1="sasank sasak sasank adf";
        String s2="adf sasank";
        String s3=s1+"   "+s2;
        String arr[]=s3.split("\\s+");
       
        Arrays.sort(arr);

        System.out.println(String.join(" ",arr));
    }
}
