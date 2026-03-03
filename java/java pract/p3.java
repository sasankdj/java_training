public class p3 {
    int m1(int a ){
        return 10;
    }
    
    void m2(p3 o){
        
        System.out.println(o.m1(100));
    } 
    public static void main(String[] args) {
        p3 obj = new p3();
        obj.m2(obj);
    }
}
