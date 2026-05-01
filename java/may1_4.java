//cja where we have 1 method in that we nee dto print 1 to 10 and 20 to 30 which is accessed from 2 thread t1,t2 apply synchonised flow for 1 to 10 and normal flow for 20 to 30 
public class may1_4 extends Thread{
    
    static may1_4 obj = new may1_4();
    public void run(){
        obj.print();
    }
    void print(){
        synchronized(this){
        for (int i = 0; i <10; i++) {
            System.out.print(i+" ");
        }
}

        for (int i = 20; i <=30; i++) {
            System.out.print(i+" ");

        }
    }
    public static void main(String[] args) {
        Thread t1= new may1_4();
        Thread t2= new may1_4();
        t1.start();
        t2.start();

    }
}
