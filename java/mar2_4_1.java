//cja 1 class 1 instance var, 1 default constructor and 1 single parameterized constructor, 1 double parameterized construct 1 triple params construct then invoke default under single, single under double, double under triple and triple under main method by providing dynamic inps

import java.util.Scanner;

public class mar2_4_1 {
    static Scanner sc= new Scanner(System.in);
    int a=sc.nextInt();
    mar2_4_1(){
        System.out.println("in default construct");
    }
    mar2_4_1(int a){
        System.out.println("in single construct"+a);
        new mar2_4_1();
    }
    mar2_4_1(int a, int b){
        System.out.println("in double construct"+a+" "+b);
        new mar2_2(sc.nextInt());

    }
    mar2_4_1(int a, int b , int c){
        System.out.println("in triple construct"+a+" "+b+" "+c);
       new mar2_4_1(sc.nextInt(), sc.nextInt());

    }
    public static void main(String[] args) {
     System.out.println(new mar2_4_1(sc.nextInt(),sc.nextInt(),sc.nextInt()).a);   
    }
}
