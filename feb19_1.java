//create a java apllication where we have 1 class it contains 1 non static var and a non static method m1 having params and return type and a static method m2 having params and return type then invoke m1 under m2 m2 under main method by providing dynamic inps

import java.util.Scanner;

class feb19_1{
    static Scanner sc = new Scanner(System.in);
    int a= sc.nextInt();
    int m1(int b){
        System.out.println("you have passed "+b);
        System.out.println("enter a integer for return from m1");
        return (sc.nextInt()) ;

    }
    static int m2(int c){
        System.out.println("you have passed "+c);
        System.out.println("enter a value to pass in instance var");
        feb19_1 obj = new feb19_1();
        System.out.println(obj.a);
        System.out.println("eneter a int to pass in m1");
        System.out.println(obj.m1(sc.nextInt())); 
        System.out.println("eneter a int to return from m2");
    return sc.nextInt();
    }
 public static void main(String[] args) {
    System.out.println("enter the integer to pass in m2");
    System.out.println(m2(sc.nextInt()));
 }   
}