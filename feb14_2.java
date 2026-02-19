//create a java application where we have 1 class it contains 1 instance variable and a static method m1 having string as params and returns int and a non static method m2 having bool as params and return nothing then invoke this method under main method
public class feb14_2 {
    int a=10;
    static int m1(String s){
        return s.length();
    }
    void m2(boolean b){
        System.out.println(b);
    }
    public static void main(String[] args) {
       System.out.println(m1("sasank")); 
        feb14_2 obj=new feb14_2();
        obj.m2(true);
    }
}
