//Create a java application where we have 1 class it contains a static method m1 having int as parameter and returns its parameter and a static method m2 having parameter as Boolean and returns nothing if the parameter is false then call m2 method itself or else invoke m1 method by passing parameter as on what no of iteration m1 method gets invoked if the m1 method return value is greater than 3 then take a new static method m3 having no para and returns nothing and print a user friendly message or else take a new static method m4 having no para and returns nothing and invoke m2 method in this method firstly invoke m2 under main method by providing dynamic inputs.

import java.util.Scanner;

public class p6 {
    static int count=0;
    static Scanner sc= new Scanner(System.in);
    static int m1(int a)
{
return a;
}   
static void m2(boolean b){
    if(b==false){
        System.out.println("enter true of false");
        m2(sc.nextBoolean());
    }
    else{
        count++;
        // m1(count);
        if (m1(count)>=3){
            m3();
        }
        else{
            m4();
        }
    }
}
static void m3(){
    System.out.println("it got 3 times");
}
static void m4(){
    System.out.println("enter true of false");
    m2(sc.nextBoolean());
}
public static void main(String[] args) {
    System.out.println("enter true or false");
        m2(sc.nextBoolean());
    }
}
