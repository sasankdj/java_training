//create a java applciation where we have 1 class it contains a static method m1 having no params and returns boolean and a non sattic method m2 having params and ret type then invoke these methods under main method, if m1 ret true invoke m2 else print a user friendly message by profviding dynamic inps

import java.util.Scanner;

public class feb19_3 {
    static Scanner sc = new Scanner(System.in);
    static boolean m1(){
	System.out.println("Enter a bool to return from m2");
        return sc.nextBoolean();
    }
    int m2(int b){
        System.out.println(b);
	System.out.println("Enter a int to return from m2");
        return sc.nextInt();
    }
    public static void main(String[] args) {
        if(m1()){
            feb19_3 obj = new feb19_3();
	System.out.println("Enter a int to pass to m2");
            obj.m2(sc.nextInt());
        }
        else{
            System.out.println("sorry man it is false");
        }
    }
}
