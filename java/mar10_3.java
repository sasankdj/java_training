//cja where we hav class insta it contains 3 fields like username, pass & email then provide details for these while creating a user and we have a non static method profile info which displays the user details then create 3 users and display their details 
import java.util.Scanner;
class mar10_3{
    static Scanner sc= new Scanner(System.in);
    String username=sc.next();
    String pass= sc.next();
    String email= sc.next();
    void profile(){
        System.out.println(this.username);
        System.out.println(this.pass);
        System.out.println(this.email);
    }
    public static void main(String[] args) {
        mar10_3 u1= new mar10_3();
        mar10_3 u2= new mar10_3();
        mar10_3 u3= new mar10_3();
        System.out.println("details of the users");
        u1.profile();
        u2.profile();
        u3.profile();


        
    }
}