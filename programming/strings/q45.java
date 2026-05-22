public class q45 {
    public static void main(String[] args) {
        String s="java";
        for (int i = 0; i <s.length(); i++) {
            for (int j = i; j < s.length()+1; j++) {
                if(!s.substring(i, j).equals(""))
                System.out.print(s.substring(i, j)+" "); 
            }
        }
    }
}
