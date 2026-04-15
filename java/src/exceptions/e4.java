public class e4 {
    void show() throws ArithmeticException{
        System.out.println("in show");
    }
    public static void main(String[] args) {
        e4 obj = new e4();
    try {
        obj.show();
    } catch (Exception e) {
        System.out.println(e);
    }
}    
}
