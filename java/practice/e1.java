class share{
    boolean flag=true;
    synchronized void printB(int n){
        if(!flag){
            try{

                wait();
            }
            catch(Exception e){

            }
        }
        System.out.print(n+" ");
        flag=false;
        notify();
    }
     synchronized void printA(int n){
        if(flag){
            try{

                wait();
            }
            catch(Exception e){

            }
        }
        System.out.print(n+" ");
        flag=true;
        notify();
    }

}
class A extends Thread{
    share s;
    A(share obj){
        this.s=obj;
    }
    public void run(){
        for (int i = 1; i <6; i++) {
           s.printA(i);
        }
    }
}
class B extends Thread{
      share s;
    B(share obj){
        this.s=obj;
    }
public void run(){
    for (int i = 1; i <6; i++) {
       s.printB(i);
    }
}
}
class e1{

    public static void main(String[] args) {
        share obj = new share();
        Thread t1 = new A(obj);
        Thread t2 = new B(obj);
        t1.start();
        t2.start();
    }
}