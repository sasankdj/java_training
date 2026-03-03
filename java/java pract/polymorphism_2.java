class A{
    void m1(int a){
        System.out.println("in m1 from class A");
    }
}

public class polymorphism_2 extends A {
    void m1(int a ){
        System.out.println("in m1 from class B");
    }
    
    public static void main(String[] args) {
        A obj = new polymorphism_2();
       
        obj.m1(10);
    }
}
