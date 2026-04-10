package p1.p2;

import java.util.Scanner;

public interface I2 {
    Scanner sc= new Scanner(System.in);
    int m3(int a);
    static int m4(int a){
        System.out.println(" in m4 "+a);
        return sc.nextInt();
    }
}
