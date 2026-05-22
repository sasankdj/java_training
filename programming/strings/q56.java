public class q56 {
    public static void main(String[] args) {
        String s=" I am preparing myself for MNC’s and Product based companies.";
        s=s.replaceAll("\\s+", "");
        int j=0,c=1;
        while (j<s.length()) {
            int end=Math.min(j+c, s.length());
            System.out.println(s.substring(j,end));
            j=end;
            c++;
        }
    }
}
