//cja 1 class it contains 1 instance var and an object parameterized constructor then invoke this under main method by providing dynamic inps

import java.util.Scanner;

class mar3_1 {
    static Scanner sc = new Scanner(System.in);
    int a =sc.nextInt();
    mar3_1(mar3_1 obj){
        System.out.println(obj.a);
        System.out.println("in obj params construct");
    }
    mar3_1(){

    }
    public static void main(String[] args) {
        mar3_1 obj = new mar3_1();
        new mar3_1(obj);
    }
}
