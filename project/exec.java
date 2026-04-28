package p1;

import java.util.Scanner;

public class exec {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        project.theLms();
        // project.banner1();
        System.out.println("1. Learn \n 2.Take Quiz \n 3.Exit");
        int c=sc.nextInt();

        if(c==1)
        hand.subjectMenu();
    else if(c==2){
        QuizSystem.mainexec();
    }
    else{
        System.out.println("thank you..");
    }
    }    
}
