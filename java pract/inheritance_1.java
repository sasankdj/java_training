class A{
        int m1(int a){
            return a ;
        }
        
    }
    class inheritance_1 extends A{
        static void m2(A obj){
         System.out.println(obj.m1(10));   
        }
        public static void main(String[] args) {
        // B obj = new B();
        inheritance_1 obj = new inheritance_1();
       m2(obj);
    }
    }

