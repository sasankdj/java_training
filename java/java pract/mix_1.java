public class mix_1 {
    static mix_1 o = new mix_1();
    static int m1(mix_1 obj){
        System.out.println(obj.m2(100));
        return 200;

    }
    int m2 (int a ){
        return a;
}
    public static void main(String[] args) {
        System.out.println(m1(o));
        
    }
}
