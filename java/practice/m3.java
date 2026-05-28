    import java.util.Scanner;

    public class m3 {

        m3(int a) {
            System.out.println(a);
        }

        void m1(int a) {
            System.out.println(a);
        }

        public interface I1 {
            public abstract int m2(int a);

        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            m3 obj = new m3(sc.nextInt());

            m3.I1 o = new I1() {
                public int m2(int a) {
                    System.out.print(a);
                    return a;
                }
            };

            m3.I1 ob = (a) -> {
                System.out.println(a);
                return a;
            };

            o.m2(20);
            ob.m2(30);
            B obj1 = new B();
            obj1.m2(50);
        }
    }

    class B implements m3.I1 {
        public int m2(int a) {
            System.out.println(a);
            return a;
        }

    }
