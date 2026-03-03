//create a java appl where we have 1 class it contains 1 static method having ret type and no params and a non static method having params and ret type then invoke these methods under main method without storing or creating obj directly by providing dynamic inps

import java.util.Scanner;

class feb26_2{
    static Scanner sc= new Scanner(System.in);
    static feb26_2 m1(){
        return new feb26_2();
    }
    int m2(int a ){
        System.out.println(a);
        return sc.nextInt();
    }
    public static void main(String[] args) {
        System.out.println(m1().m2(sc.nextInt()));
    }
}