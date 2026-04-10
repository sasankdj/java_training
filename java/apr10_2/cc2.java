package test;
import p1.p2.*;

import java.util.Scanner;

import p1.*;
public class cc2 extends A implements I2{
    static Scanner sc= p1.I1.sc;
    cc2(){
        super(sc.nextInt());
    }
    public int m4(int a){

        System.out.println("in m4 "+a);
        return sc.nextInt();
    }
}
