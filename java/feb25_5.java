
import java.util.Scanner;

//create a java application where we have 1 class batch 251 here user need to enter data of 5 boys & 5 girls and have a method called display of non static which displays student data then if user want to see boys data display boys data , if user wants to see girls data display girls data, if user want to see both the data display both by providing dynamic inps 

public class feb25_5 {
    static Scanner sc= new Scanner(System.in);
    
    String s1=sc.next();
    String s2=sc.next();
    String s3=sc.next();
    String s4=sc.next();
    String s5=sc.next();
    void display(){
        System.out.println("names");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);

    }
    public static void main(String[] args) {
        System.out.println("enter the details of boys");
        feb25_5 boys = new feb25_5();
        System.out.println("enter the details of girls");
        feb25_5 girls = new feb25_5();
        System.out.println("enter 1 for boys \n 2 for girls \n 3 for both ");
        int c=sc.nextInt();
        if(c==1){
            boys.display();
        }
        else if(c==2){
            girls.display();
        }
        else if(c==3){
            boys.display();
            girls.display();
        }
        else
            System.out.println("enter correct input");
    }
}
