//java apll 1 class contains 1 instance var, 1 static and 1 non static method having params and ret type then invoke these methods under main method without storing the obj by providing dynamic inps

import java.util.Scanner;

class feb20_2{
    static Scanner sc = new Scanner(System.in);
    int a=10;
    static int m1(int b){
        return sc.nextInt();
    }
    int m2(int c ){
        return sc.nextInt();
    }
    public static void main(String[] args) {
        System.out.println(feb20_2.m1(sc.nextInt()));
        System.out.println(new feb20_2().m2(sc.nextInt()));

    }
}