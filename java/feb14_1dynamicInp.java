import java.util.Scanner;

public class feb14_1dynamicInp {
    static void m1(boolean a,float b){
        System.out.println(a);
        System.out.println(b);

    }
    void m2(int c){
        System.out.println(c);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the values");
        boolean a=sc.nextBoolean();
        float b=sc.nextFloat();
        m1(a,b);
        int c=sc.nextInt();
        sc.close();
        feb14_1dynamicInp obj=new feb14_1dynamicInp();
        obj.m2(c);
    }
}
