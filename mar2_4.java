//cja 1 class 1 instance var, 1 default constructor and 1 single parameterized constructor, 1 double parameterized construct 1 triple params construct then invoke default under single, single under double, double under triple and triple under main method by providing dynamic inps

import java.util.Scanner;

public class mar2_4 {
    static Scanner sc= new Scanner(System.in);
    int a;
    mar2_4(){
        System.out.println("in default construct");
    }
    mar2_4(int a){
        this();
        System.out.println("in single construct");
    }
    mar2_4(int a, int b){
        this(a);
        System.out.println("in double construct");

    }
    mar2_4(int a, int b , int c){
        this(a, b);
        System.out.println("in triple construct");

    }
    public static void main(String[] args) {
        new mar2_4(sc.nextInt(),sc.nextInt(),sc.nextInt());
    }
}
