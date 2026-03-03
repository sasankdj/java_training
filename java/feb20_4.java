//create a java apllication where we have 1 class it contains 1  non static method having params and ret type nd a static method having obj as params and ret ntg then invoke m1 under m2, and m2 under main method by providing dynamic inps

import java.util.Scanner;

public class feb20_4 {
    static Scanner sc = new Scanner(System.in);
    int c=sc.nextInt();
    int m1(int b){
        return sc.nextInt();
    }
    static void m2(feb20_4 f){
        System.out.println("inside m2");
        System.out.println(f.c);
    }
    public static void main(String[] args) {
        feb20_4 obj = new feb20_4();
        
        feb20_4.m2(obj);
    }
}
