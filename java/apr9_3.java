//lambda expression
public interface apr9_3 {
// int m1(int a);


// void m1(int a);

int m1();
public static void main(String[] args) {
    // apr9_3 obj =(a)->{
    //     System.out.println("in m1 "+a);
    //     return 10;
    // };

    // apr9_3 obj =(a)-> System.out.println("in m1 "+a);

    apr9_3 obj =()-> 10;   // 10 is return value we should not put return keyword when in 1 line

    System.out.println(obj.m1());
}    
} 
