//create a java apllication where we have 1 class it contains 1  non static method having params and ret type nd a static method having obj as params and ret ntg then invoke m1 under m2, and m2 under main method by providing dynamic inps

import java.util.Scanner;

public class feb20_3 {
    static Scanner sc = new Scanner(System.in);
    int m1(int b){
        return sc.nextInt();
    }
    static void m2(feb20_3 f){
        System.out.println("inside m2");
        System.out.println(f);
    }
    public static void main(String[] args) {
        feb20_3 obj = new feb20_3();
        System.out.println(obj.m1(sc.nextInt()));
        feb20_3.m2(obj);
    }
}
