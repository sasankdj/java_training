package test;
import p1.*;
public class cc1 extends Ab1 implements I1{
    cc1(){
        super(sc.nextInt());
    }
    public int m1(int a){
        System.out.println("in m1 "+a);
        return sc.nextInt();
    }
    public int m3(int a){
         System.out.println("in m3 "+a);
        return sc.nextInt();
    }
}
