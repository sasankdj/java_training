abstract class A{
    A(int a){
        System.out.println("in a"+a);
    }
    abstract void m1();
    abstract void m2();
}
interface B {
    abstract void m3();
    abstract void m4();
    static void m5(){
        System.out.println("in m5");
    }
    default void m6(){
        System.out.println("in m6");
    }

    
}
 interface C {
    abstract void m7();
    default void m8(){
        System.out.println("in m8");
    }
    default void m9(){
        System.out.println("in m9");
    }
    
}
public class job {
    public static void main(String[] args) {
        A obj = new A(5) {
            void m1(){
                System.out.println( "in m1");
            }
            void m2(){
                System.out.println("in m2");
            }
        };
        B obj2 = new B() {
          public  void m3(){
                System.out.println("in m3");
            }
            public  void m4(){
                System.out.println("in m4");
            }
        };
        C obj3 =()-> {
           System.out.println("in m7");
        };
        obj.m1();
        obj.m2();
        obj2.m3();
        obj2.m4();
        B.m5();
        obj3.m7();
        obj3.m8();
        obj3.m9();
        
    }
}
