package p1;

import java.util.Scanner;

public interface I1 {
    public Scanner sc= new Scanner(System.in);
    public int m1(int a);
    public default int m2(int a){
        System.out.println("in m2 "+a);
        return sc.nextInt();
    }
    
} 
