//cja 1 classit contains 2 instance vars without initialization the initialize these vars while creating object and display them under a non static method display by providing dynamic inps

import java.util.Scanner;

public class mar2_3 {
    static Scanner sc= new Scanner(System.in);
    int a;
    int b;
    mar2_3(int a , int b){
        this.a=a;
        this.b=b;
    }
    void display(){
        System.out.println(a+" "+b);
    }
    public static void main(String[] args) {

        mar2_3 obj =new mar2_3(sc.nextInt(),sc.nextInt());
        obj.display();
    }
}
