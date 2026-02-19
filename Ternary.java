public class Ternary {
    
    public static void main(String[] args) {
        int a=10;
    int b=10;
    int c=30;
     String res =(a==b && b==c)?"all are equal":(a>=b && a>=c) ?(a==b)?"ab greatest"
     :(a==c)?"ac greatest":"a is greatest":
        (b>=a && b>=c) ?(b==c)?"bc greatest":"b is greatest":"c is greatest";
        System.out.println(res);
    }

}
