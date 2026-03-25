//Cja where we have class insta it contains 1 private field password then provide setter and getter methods for this variable and we have a class user from here reset the password and display new password to the user

import java.util.Scanner;

class insta {
    private String password="hi";
   void setPassword(String password) {
        this.password = password;
    }
   String getPassword() {
        return password;
    }
}
class mar23_1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        insta u1= new insta();
        System.out.println("enter new passowrd");
        u1.setPassword(sc.next());
        System.out.println("the password updated is "+u1.getPassword());
    }
}