//create a java application where we have 1 class it contains one static method and one non static method then invoke these 2 methods under main method in single line by providing dynamic inputs, without creating object directly.
public class p9 {
    static p9 m1(){
        return new p9();
    }
    void m2(){
        System.out.println("in m2");
    }
    public static void main(String[] args) {
        m1().m2();
    }
}
