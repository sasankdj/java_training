
class apr23_1 extends Thread{
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        apr23_1 th= new apr23_1();
        th.start();
        // System.out.println(th);
        for (int i = 0; i < 100; i++) {
            System.out.println(" "+ i);
        }
    }
}