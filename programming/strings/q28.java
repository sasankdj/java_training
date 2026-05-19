public class q28{
    public static void main(String[] args) {
     String s= "java^%123";
     int count=0;
        for (int i = 0; i <s.length(); i++) {
            char c=s.charAt(i);
            if(!Character.isLetterOrDigit(c) && !(c==' ')){
                // System.out.println(c+" "+i);
                count++;
            }
        }
        System.out.println(count);
    }
}
