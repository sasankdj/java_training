//Create a java application where we have one class it contains 2 instance variables without initialisation then initialise those variables while creating object and display them under an object parameterised constructor here we need to display both default values and user given values invoke these properties under main by providing dynamic inputs

import java.util.Scanner;

public class mar5_1 {
    static Scanner sc = new Scanner(System.in);
    int a;
    int b;

    mar5_1(int a, int b) {
        this.a = a;
        this.b = b;

    }

    mar5_1(mar5_1 obj) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(obj.a);
        System.out.println(obj.b);
    }

    public static void main(String[] args) {
        mar5_1 obj = new mar5_1(sc.nextInt(), sc.nextInt());
        new mar5_1(obj);
    }
}