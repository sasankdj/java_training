public class q55 {
    public static void main(String[] args) {
        String s="sasank";
        for (int i = 0; i <s.length(); i+=3) {
            int end=Math.min(i+3, s.length());
            System.out.println(s.substring(i,end));
        }
    }
}
