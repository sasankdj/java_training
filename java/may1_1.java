//cja where we have 1 class it contains a method which prints  the numbers from 1 to 10 then access this method with 2 different threads wrt to same object and provide 1 by 1 flow of execution 
class A {
    synchronized void print() {
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
    }
}

class may1_1 extends Thread {
    static A obj= new A();
    public void run() {

        obj.print();
    }
    public static void main(String[] args) {
        
        Thread t1 = new may1_1();

        Thread t2 = new may1_1();
        t1.start();
        t2.start();

    }
}

