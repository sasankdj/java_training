
public class q36
{
        static boolean palindrome(String s){
            String r="";
            for (int i = s.length()-1;i>=0; i--) {
                r+=s.charAt(i);

            }
            return r.equals(s);
        }
       public static void main(String[] args) {
     String s= "java123 ^%* HHK";
    

       System.out.println(palindrome(s));
    
    }
}
