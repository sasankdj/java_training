public class apr16_4 {
    public static void main(String[] args) {
        String s="bharagav";
        try {
            System.out.println(s.charAt(9));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(e);
        }
       
    }
}
