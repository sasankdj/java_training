
//cja where we have 1 class it contains a method which iterates the numbers from 1 to 20 then access this method from 2 different threads, print all 2 multiples by using 1st thread and 3 multiples using 2nd thread
class count extends Thread{
   static int i=1;
static void numbers(){
        for (i=1; i <=20; i++) {
            
        }
    }
}
class odd extends count{
    public void run(){

        if(i%2==0){
            System.out.println(i);
        }
    }

}
public class apr24_5 extends count{
    
     public void run(){

        if(i%2==0){
            System.out.println(i);
        }
    }
public static void main(String[] args) {
    count t1= new count();
    t1.start();
    apr24_5 t2 = new apr24_5();
    t2.start();
}
    
}
