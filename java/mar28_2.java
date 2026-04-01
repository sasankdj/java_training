//static binding or method binding
class A{
    public static void main(String[] args) {
        System.out.println("in class A");
    }
}
public class mar28_2 extends A{
    public static void main(String[] args,float b) {
        System.out.println("in overrided method");
        // main(args,10);
    }
    public static void main(String[] ar,int a) {
        System.out.println("in overloaded method");
    }
    public static void main(String[] args) {
        main(args,20.2f);
        main(args,20);

    }
}
