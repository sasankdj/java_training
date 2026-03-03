//Create a java application where we have 1 class it contains 3 non static methods and 3 static methods then invoke 3 non static under 3 static methods one each and static methods under main method by providing dynamic inputs
public class p3 {
    void m1() {
        System.out.println("in m1");
    }

    void m2() {
        System.out.println("in m2");
    }

    void m3() {
        System.out.println("in m3");
    }
    static void m4(){
        System.out.println("in m4");
    }
      static void m5(){
        System.out.println("in m5");
    }
      static void m6(){
        System.out.println("in m6");
    }
    public static void main(String[] args) {
        m4();
        m5();
        m6();
    }
}
