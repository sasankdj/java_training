
class A {
    synchronized void print() {
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
    }
}

class may1_2 extends Thread {
    static A obj= new A();
    public void run() {

        obj.print();
    }
    public static void main(String[] args) {
        
        Thread t1 = new may1_2();

        Thread t2 = new may1_2();
        t1.start();
        t2.start();

    }
}

