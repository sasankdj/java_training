//cja where we need to create 3 user defined threads and then display their priority values along with names, check whether they are under cpu control or not and then set userdefined names and priorities for them then start the threads and again display priority values, check whether they are alive or not 
public class apr24_1 implements Runnable {
    public void run(){

    }
    public static void main(String[] args) {
        apr24_1 obj = new apr24_1();
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj);
        Thread t3 = new Thread(obj);
        System.out.println(t1.getName() + " " + t1.getPriority());
        System.out.println(t2.getName() + " " + t2.getPriority());
        System.out.println(t3.getName() + " " + t3.getPriority());
        t1.setPriority(2);
        t2.setPriority(3);
        t3.setPriority(Thread.MAX_PRIORITY);
        t1.setName("thread 1");
        t2.setName("thread 2");
        t3.setName("thread 3");
        System.out.println(t1.getName() + " " + t1.getPriority());
        System.out.println(t2.getName() + " " + t2.getPriority());
        System.out.println(t3.getName() + " " + t3.getPriority());

    }
}
