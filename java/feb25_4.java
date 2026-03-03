//create a java application where we have 1 class batch 251 here user need to enter data of 5 boys & 5 girls and have a method called display of non static which displays student data then if user want to see boys data display boys data , if user wants to see girls data display girls data, if user want to see both the data display both by providing dynamic inps 

import java.util.Scanner;

public class feb25_4 {
    static Scanner sc= new Scanner(System.in);
    String b1,b2,b3,b4,b5;
    String g1,g2,g3,g4,g5;

    void display(int choice){
        if (choice == 1) {
            System.out.println("Boys Data:");
            System.out.println(b1);
            System.out.println(b2);
            System.out.println(b3);
            System.out.println(b4);
            System.out.println(b5);
        }

        else if (choice == 2) {
            System.out.println("Girls Data:");
            System.out.println(g1);
            System.out.println(g2);
            System.out.println(g3);
            System.out.println(g4);
            System.out.println(g5);
        }

        else if (choice == 3) {
            System.out.println("Boys Data:");
            System.out.println(b1);
            System.out.println(b2);
            System.out.println(b3);
            System.out.println(b4);
            System.out.println(b5);

            System.out.println("Girls Data:");
            System.out.println(g1);
            System.out.println(g2);
            System.out.println(g3);
            System.out.println(g4);
            System.out.println(g5);
        }

        else {
            System.out.println("Invalid choice");
        }
    
    }
    public static void main(String[] args) {
        feb25_4 obj = new feb25_4();
         System.out.println("Enter 5 Boys Names:");
        obj.b1 = sc.next();
        obj.b2 = sc.next();
        obj.b3 = sc.next();
        obj.b4 = sc.next();
        obj.b5 = sc.next();

        System.out.println("Enter 5 Girls Names:");
        obj.g1 = sc.next();
        obj.g2 = sc.next();
        obj.g3 = sc.next();
        obj.g4 = sc.next();
        obj.g5 = sc.next();

        System.out.println("Enter choice:");
        System.out.println("1 → Boys");
        System.out.println("2 → Girls");
        System.out.println("3 → Both");
        int choice=sc.nextInt();
        obj.display(choice);

    }    
}
