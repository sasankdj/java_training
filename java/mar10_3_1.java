//cja where we hav class insta it contains 3 fields like username, pass & email then provide details for these while creating a user and we have a non static method profile info which displays the user details then create 3 users and display their details 

import java.util.Scanner;

public class mar10_3_1 {
    static Scanner sc= new Scanner(System.in);
    String username;
    String password;
    String email;

    mar10_3_1(String username, String password,String email) {
        this.username=username;
        this.password=password;
        this.email=email;
    }

    void profile() {
        System.out.println(username);
        System.out.println(password);
        System.out.println(email);
    }

    public static void main(String[] args) {
        mar10_3_1 u1=new mar10_3_1(sc.next(), sc.next(), sc.next());
        mar10_3_1 u2=new mar10_3_1(sc.next(), sc.next(), sc.next());
        mar10_3_1 u3=new mar10_3_1(sc.next(), sc.next(), sc.next());
        u1.profile();
        u2.profile();
        u3.profile();

    }
}
