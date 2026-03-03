//Create a java application where we have 1 class it contains a static method m1 having object as parameter and returns object type of value and a non-static method m2 having 3 parameters and returns nothing then invoke m2 under m1 and m1 under main method (pass the parameter without storing).
public class p4 {
    static p4 m1(p4 o){
        o.m2(10, 0, 0);
        return o;
    }
    void m2(int a , int b, int c){
        System.out.println(a+""+b+""+c);
    }
    public static void main(String[] args) {
       System.out.println(m1(new p4())); 
    }
}
