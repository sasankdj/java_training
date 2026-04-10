package p3;
import p1.*;
import p1.p2.I2;
public class cc extends A1 implements I1,I2 {
    public int m1(int a){
        System.out.println("in m1 "+a);
        return sc.nextInt();
    }
    cc(){
        super(sc.nextInt());
    }
    public int m2(int b){
        System.out.println("in m2"+b);
        return sc.nextInt();
    }
    public int m3(int a){
         System.out.println("in m1 "+a);
        return sc.nextInt();
    }
    
}
