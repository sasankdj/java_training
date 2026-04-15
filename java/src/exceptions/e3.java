// package exceptions;

public class e3 extends Exception{
    public e3(){
        super("sasank");
    }
    public static void main(String[] args) {
        try {
            throw new e3();
            
        } catch (Exception e) {
           System.out.println(e);
        }
    }
}
