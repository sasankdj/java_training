import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class q {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        try {
        BufferedReader bf= new BufferedReader(new FileReader("data.txt"));
        int score=0;
        String question;
            while ((question=bf.readLine())!=null) {
                String op1=bf.readLine();
                String op2=bf.readLine();
                String op3=bf.readLine();
                String op4=bf.readLine();
                String ans=bf.readLine();
                bf.readLine();

                System.out.println(question);
                System.out.println(op1);
                System.out.println(op2);
                System.out.println(op3);
                System.out.println(op4);
                // System.out.println(op);


                System.out.println("enter your answer");
                String c=sc.nextLine();

                if(c.toUpperCase().equals(ans)){
                    score++;
                    System.out.println("correct ans");
                    }
                else
                    System.out.println("wrong ans .. the correct ans is "+ans);
            }    
        }
         catch (Exception e) {
            
        }
    }
}
