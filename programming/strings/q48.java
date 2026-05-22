import java.util.Arrays;

public class q48 {
    public static void main(String[] args) {
        String s="a b abc bcd";
        String arr[]=s.split("\\s+");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
