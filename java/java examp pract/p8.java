//create a java application where we have class student it contains Non static fields like Std_name,Std_id,Std_batch then we have a method display which displays the student details, enter the data of 4 students and after that ask user to which student details he need to see and based on his input display that respective student details by providing dynamic inputs.

import java.util.Scanner;

public class p8 {
    static Scanner sc = new Scanner(System.in);
    String std_name = sc.next();
    int std_id = sc.nextInt();
    int batch = sc.nextInt();

    void display() {
        System.out.println(std_name);
        System.out.println(std_id);
        System.out.println(batch);

    }

    public static void main(String[] args) {
        p8 s1 = new p8();
        p8 s2 = new p8();
        p8 s3 = new p8();
        p8 s4 = new p8();
        System.out.println("enter the student number to display");
        int student = sc.nextInt();
        switch (student) {
            case 1:
                s1.display();
                break;
            case 2:
                s2.display();
                break;
            case 3:
                s3.display();
                break;
            case 4:
                s4.display();
                break;
            default:
                System.out.println("enter valid input");
                break;
        }

    }
}
