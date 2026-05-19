import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        String arr[]=s.split(" ");
        String max="";
        for (String st : arr) {
            if(st.length()>max.length()){
                max=st;
            }
        }
        System.out.println(max);
    }
}
