import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class a {
    static String file(int n){
        switch (n) {
            case 1:
                return "a.java";
            case 2:
                return "data.txt";    
        
            default:
                return "";
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a choice to choose ");
        int n=sc.nextInt();

        try {
            BufferedReader bf = new BufferedReader(new FileReader(file(n)));

            String s;
            // while ((s = bf.readLine()) != null) {
            //     System.out.println(s);

            // }
             while (true) {
                s = bf.readLine();
                if(s==null) 
                    break;
                else
                System.out.println(s);

            }
        } catch (Exception e) {

        }
    }
}
