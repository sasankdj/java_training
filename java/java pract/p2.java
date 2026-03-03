public class p2 {
    int m1(int a ){
        return a*=10;
    }
    static int m2(p2 o){
        
        return o.m1(243);
    } 
public static void main(String[] args) {
    p2 obj = new p2();
   System.out.println(m2(obj)); 
}    
}
