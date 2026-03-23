
//Cja where we have class insta it contains 1 private field password then provide setter and getter methods for this variable and we have a class user from here reset the password and display new password to the user
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
        insta u1= new insta();
        
        u1.setPassword("hello");
        System.out.println("the password updated is "+u1.getPassword());
    }
}