package p1.p2.p3;

import java.util.Scanner;

public interface I3 {
    Scanner sc= new Scanner(System.in);
    int m6(int a);

    public interface I4 {
    int m7(int a);
    
        
    }
    I4 obj = new I4() {
        public int m7(int a){
            System.out.println("in m7 "+a);
            return sc.nextInt();
        }
    };
    
}
