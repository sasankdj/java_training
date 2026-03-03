
class Person {

    void m1(String s) {
        System.out.println(s);
    }
}

public class inheritance_2 extends Person {

    static void m2(inheritance_2 obj) {
        obj.m1("sasank");
    }

    public static void main(String[] args) {
        inheritance_2 obj = new inheritance_2();
        m2(obj);
    }
}
