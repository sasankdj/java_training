interface A{
    abstract void m1();
    abstract void m2();
    default void m3(){
        System.out.println("in m3");
    }
    default void m4(){
        System.out.println("in m4");
    }
}
class A1 implements A{
    public void m1(){
        System.out.println("in m1");
    }
    public void m2(){
        System.out.println("in m2");
    }
}
interface B{
    abstract void m5();
    abstract void m6();
    default void m7(){
        System.out.println("in m7");
    }

}
interface C{
    abstract void m8();
    default void m9(){
        System.out.println("in m9");
    }
    default void m10(){
        System.out.println("in m10");
    }
}
public class job2  {
    public static void main(String[] args) {
        B obj = new B() {
            public void m5(){
                System.out.println("in m5");
            }
            public void m6(){
                System.out.println("in m6");
            }
        };
        C obj1=()->{
            System.out.println("in m8");
        };

       A obj2 = new A1();
       obj2.m1();
       obj2.m2();
       obj2.m3();
       obj2.m4();
       obj.m5();
       obj.m6();
       obj.m7();
       obj1.m8();
       obj1.m9();
       obj1.m10();
    }
}
