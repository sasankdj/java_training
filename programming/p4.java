import java.util.Scanner;

public class p4 {
    
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int num=sc.nextInt();
    if(num>=100&&num<=1000){
        if(num%2==0){
            System.out.println(num%3);
        }
        else
            System.out.println(num%2);
    }   
    else
        System.out.println("wrong number"); 
    }
}
