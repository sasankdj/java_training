public class feb16_p3 {
static int x=10;
int y=5;
int m1(int a){
    return ++x+a+y++*x;
}
static int m2(int b){
    --x;
    feb16_p3 obj= new feb16_p3();
    return obj.m1(b+2)/2;
    
}
    public static void main(String[] args) {
        System.out.println(m2(10));
        System.out.println(m2(20));
    }
}
