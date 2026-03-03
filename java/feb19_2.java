//create a java applciation where we have 1 class it contains 1 instance var , 1 non statiic method having params and ret type 1 static method having params and ret type , another non static method m3 having params and ret type then invoke m1 under m2 , m2 under m3 and m3 under main method by providing dynamic inps

import java.util.Scanner;

class feb19_2{
    static Scanner sc= new Scanner(System.in);
    int a =10;
    int m1(int b){
        return sc.nextInt(); 
    }
    static int  m2(int c){
	System.out.println(c);
	System.out.println("enter a integer for a ");
        feb19_2 obj = new feb19_2();
	System.out.println("enter a integer to pass in m1 ");

        System.out.println(obj.m1(sc.nextInt()));
	System.out.println("enter a int to return from m2");
        return sc.nextInt();
    }
    int m3(int d){
	System.out.println(d);
	System.out.println("enter a integer to pass in to m2 ");

        System.out.println(m2(sc.nextInt()));
	System.out.println("enter a int to return from m3");
        return sc.nextInt();
    }
    public static void main(String[] args) {
	System.out.println("enter a integer for a ");
        feb19_2 obj = new feb19_2();
	System.out.println("enter a integer to pass in to m3 ");
        obj.m3(sc.nextInt());
    }
}