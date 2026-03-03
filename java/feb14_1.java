//create a java application where we have 1 class it contains 1 instance variable and a non static method m1 having integer as params and return nothing and a static method m2 having bool and float as params and return nothing then invoke these methods under main method 
public class feb14_1 {
    static void m1(boolean a,float b){
        System.out.println(a);
        System.out.println(b);

    }
    void m2(int c){
        System.out.println(c);
    }
    public static void main(String[] args) {
        m1(true,10.2f);
        feb14_1 obj=new feb14_1();
        obj.m2(30);
    }
}
