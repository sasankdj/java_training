class A extends Thread {
    public void run() {
        for (char i = 'A'; i <= 'Z'; i++) {

            System.out.print(i + " ");
            if (i == 'G') {
                apr29_1.t2.resume();
                apr29_1.t1.suspend();
            }
        }
        apr29_1.t2.resume();
    }
}

class B extends Thread {
    public void run() {

        for (char i = 'a'; i <= 'z'; i++) {
            System.out.print(i + " ");
            if (i == 'g') {
                apr29_1.t1.resume();
                apr29_1.t2.suspend();
            }
        }
        

    }
}

public class apr29_1 {
    static A t1;
    static B t2;

    public static void main(String[] args) {
        t1 = new A();
        t2 = new B();
        t1.start();
        t2.start();
        t2.suspend();
    }
}
