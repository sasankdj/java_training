//cja where we need to handle string index out of bound exception
public class apr16_4 {
    public static void main(String[] args) {
        String s="sasank";
        try {
            for (int i = 0; ; i++) {
                System.out.println(s.charAt(i));
            }
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(e);
        }
       
    }
}
