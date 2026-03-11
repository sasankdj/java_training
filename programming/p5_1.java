import java.util.Scanner;

public class p5_1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        if(num<0 || num>100){
           
            System.err.println("invalid input");
        }
        else{
             if(num>90)
                System.out.println("super smart");
            else if(num>80)
                System.out.println("smart");
            else if(num>70)
                System.out.println("smart enough");
            else if(num>35)
                System.out.println("not smart");
            else
                System.out.println("dumb");
        }
}
}
