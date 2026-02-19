public class feb16_p1 {
    static int var=10;
    int m1(int a){
        return (a+var)*2;

    }
    static int m2(int b){
        feb16_p1 obj=new feb16_p1();
        
        return obj.m1(b)+5;
    }
    public static void main(String[] args) {
        System.out.println(m2(20));
    }
}
