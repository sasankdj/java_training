
import java.util.Scanner;

class A{
    static Scanner sc=new Scanner(System.in);
    int m1(int a){
        System.out.println("in m1 "+a);
        return sc.nextInt();
    }
    class mic1{
        mic1(int a){
            System.out.println("in param constructor mic1 "+a);
        }
        int m2(int a){
            class C{
                int m3(int b){
                    System.out.println("in m3 ");
                    return sc.nextInt();
                }
            }
            C obj = new C();
            obj.m3(sc.nextInt());
            return sc.nextInt();
        }
    }
    static class sic{
        sic(int a){
            System.out.println("in params construct "+a);
        }
        static int m4(int a){
            System.out.println("in static m4 "+a);
            return sc.nextInt();
        }
        int m5(int b){
            System.out.println("in non static method m5 "+b);
            return sc.nextInt();
        }
        class D{
            void m6(){
                System.out.println("in m6 from class D");
            }
        }
    }
}
class apr8_1{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        A obj = new A();
        obj.m1(sc.nextInt());
        A.mic1 obj1 = obj.new mic1(sc.nextInt());
        obj1.m2(sc.nextInt());

        A.sic.m4(sc.nextInt());
        A.sic obj2=  new A.sic(sc.nextInt());

        obj2.m5(sc.nextInt());
        A.sic.D obj3= obj2.new D();
        obj3.m6();


    }
}