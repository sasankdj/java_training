public class p5 {
int a;
    public p5() {
    }
    p5(int a ){
        this.a=a;
    }
    static void m1(p5 o){
        System.out.println(o.a);
    }
    public static void main(String[] args) {
        
        p5 obj= new p5(10);
        m1(obj);

    }
}
