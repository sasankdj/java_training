//cja where we have class insta and 2 private fields with username and passoword  then provide setter and getter methods for this variable have a class from here if user want to reset username reset the user name, and display new user name, if user want to reset password reset the pass and display new pass, if user want to reset both reset both by using constructor injection and display the values

import java.util.Scanner;

class insta {
    private String username="null";
    private String password="hi";
    insta{

    }
    insta(String username, String password){
        this.username=username;
        this.password=password;
    }
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
public class mar23_3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("choose a option to do \n 1. for reset the username \n 2. for reset the password \n 3. to reset the user name and password");
        String c= sc.next();
        insta user= new insta();
        if(c.equals("username")){
            user.setUsername(sc.next());
        }
        else if (c.equals("password")){
            user.setPassword(sc.next());
        }
        else if(c.equals("both")){
            insta obj =new insta(sc.next(),sc.next());
        }
        else{
            System.out.println("invalid input");
        }

    }
}
