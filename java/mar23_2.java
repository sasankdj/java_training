//cja where we have 1 class insta it contains 2 private fields username and password then provide setter and getter methods for this variable an then we have a class user from here reset the fields and display new values to user
import java.util.Scanner;

class insta {
    private String username="null";
    private String password="hi";
    public void setUsername(String username) {
        this.username = username;
    }
    public String getUsername() {
        return username;
    }
   void setPassword(String password) {
        this.password = password;
    }
   String getPassword() {
        return password;
    }
}
class mar23_2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        insta u1= new insta();
         System.out.println("enter new username");
        u1.setUsername(sc.next());
        System.out.println("enter new passowrd");
        u1.setPassword(sc.next());
        System.out.println("the username updated is "+u1.getUsername());

        System.out.println("the password updated is "+u1.getPassword());
    }
}