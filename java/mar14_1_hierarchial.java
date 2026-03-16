class A{
    static void m1(){
        System.out.println("in m1");
    }
    void m2(){
        System.out.println("in m2");
    }
}
class B extends A{
    void m3(){
        System.out.println("in m3");
    }
}
class C extends A{
    void m4(){
        System.out.println("in m4");
    }
}
public class mar14_1_hierarchial {
    public static void main(String[] args) {
        A.m1();
        C obj = new C();
        obj.m2();
        obj.m4();
        new B().m3();
    }
}
