///* create a java application where we have class insta it contains private fields like username, password and mobile number then provide setter and getter methods for this variables we have a class user here it contains a method like login in this method ask user to enter credentials if both are valid then display login successful, if both are invalid then ask user whether he need to know his username if yes then ask user to enter mobile number if the mobile number is matching then display username and redirect him to login page based on his requirements, if the mobile number is not matching then display user not found then ask him whether he need to reenter and perform respective operation, if only username is invalid ask user whether to reset the username if yes then reset the username and redirect him to login based on his requirement, if only password is invalid perform same operation like username then invoke login under main method by providing dynamic inputs */

import java.util.Scanner;

class Insta{
    private String username="sasank";
    private String pass="123";
    private String mobile="12345";

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setPass(String pass) {
        this.pass = pass;
    }
    public String getUsername() {
        return username;
    }
    public String getPass() {
        return pass;
    }
    public String getMobile() {
        return mobile;
    }


}
public class mar25_1 {
    Scanner sc= new Scanner(System.in);
    Insta user= new Insta();
    void login(){
        System.out.println("enter the login details \n username");

        String username=sc.next();
        String pass= sc.next();

        if(user.getUsername().equals(username) && user.getPass().equals(pass)){
            System.out.println("Login successful");
        }
        else if(user.getUsername().equals(username)){
            System.out.println("if you want to reset your password press 1 else press 2");
            int n=sc.nextInt();
            if(n==1){
                System.out.println("enter password to change with");
                pass=sc.next();
                user.setPass(pass);
                login();
            }
            
        }
        else if(user.getPass().equals(pass)){
             System.out.println("if you want to reset your username press 1 else press 2");
            int n=sc.nextInt();
            if(n==1){
                System.out.println("enter username to change with");
                username=sc.next();
                user.setUsername(username);
                login();
            }
        }
        else
        {
            System.out.println("wanted to know your username? then enter your mobile number if not enter 'no'");
            String mobile=sc.next();
            if(user.getMobile().equals(mobile)){
                System.out.println("your username is "+user.getUsername());
            }
            else{
                System.out.println("user not found");
                System.out.println("enter 1 to re enter the mobile number \n 2 to exit");
                int c=sc.nextInt();
                if(c==1){
                    login();
                }
                
            }
        }

    }
    public static void main(String[] args) {
    //    Insta user=new Insta();
        mar25_1 obj= new mar25_1();
        obj.login();
    }
}
