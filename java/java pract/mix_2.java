public class mix_2 {
    static int a=10;
    int b=20;
    static mix_2 obj = new mix_2();
    static void m1(){
        System.out.println("in m1");
        System.out.println(a+obj.b);
    }
    void m2(){
        System.out.println("in m2");
        System.out.println(a+b);

    }


    public static void main(String[] args) {
        m1();
        obj.m2();        
    }
}
