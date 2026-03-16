class A {
    static void m1() {
        System.out.println("in m1");
    }

    void m2() {
        System.out.println("in m2");
    }
}

class B extends A {
    static void m3() {
        System.out.println("in m3");
    }

    void m4() {
        System.out.println("in m4");
    }
}

public class mar13_1 extends B {
    void m5() {
        System.out.println("in m5");

    }

    public static void main(String[] args) {
        mar13_1 obj = new mar13_1();
        m1();
        obj.m2();
        m3();
        obj.m4();
        obj.m5();
    }
}
