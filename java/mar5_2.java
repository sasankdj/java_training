//Create a java application where we have one class it contains one instance variable and a default constructor, one single parameterised constructor, one double parameterised constructor, one object parameterised constructor then invoke single under double, double under object and rest under main by providing dynamic inputs

import java.util.Scanner;

public class mar5_2 {
    static Scanner sc = new Scanner(System.in);

    int a=sc.nextInt();

    mar5_2() {
        System.out.println("in default");
    }

    mar5_2(int a) {
        System.out.println(a);
    }

    mar5_2(int a, int b) {
        System.out.println(a + " " + b);
        new mar5_2(sc.nextInt());
    }

    mar5_2(mar5_2 obj) {
        System.out.println(a);
        new mar5_2(sc.nextInt(), sc.nextInt());
    }

    public static void main(String[] args) {
        mar5_2 obj = new mar5_2();
        new mar5_2(obj);
    }
}
