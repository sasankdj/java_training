public class apr20_6 {
    public static void main(String[] args) {
        String s="cvcorp";
        int n=s.length();
        for (int i = n-1; i >=0; i--) {
            for (int j =0;j<=i;j++) {
                System.out.print(s.charAt(j));
            }
            for(int j=2;j<2*(n-i);j++){
                System.out.print(" ");
            }
            for (int j =i;j>=0;j--) {
                System.out.print(s.charAt(j));
            }
            System.out.println();
            
        }
         for (int i = 1; i <=n-1; i++) {
            for (int j =0;j<=i;j++) {
                System.out.print(s.charAt(j));
            }
            for(int j=2;j<2*(n-i);j++){
                System.out.print(" ");
            }
            for (int j =i;j>=0;j--) {
                System.out.print(s.charAt(j));
            }
            System.out.println();
            
        }

    }
}
