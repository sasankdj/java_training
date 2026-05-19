public class q30{
    public static void main(String[] args) {
     String s= "java123 ^%* HHK";
   
        for (int i = 0; i <s.length(); i++) {
            char c=s.charAt(i);
            if(Character.isLowerCase(c)){
               System.out.print(c+ " ");
            }
        }
        System.out.println();
        for (int i = 0; i <s.length(); i++) {
            char c=s.charAt(i);
            if(Character.isUpperCase(c)){
               System.out.print(c+ " ");
            }
        }
        System.out.println();
        for (int i = 0; i <s.length(); i++) {
            char c=s.charAt(i);
            if(!Character.isLetterOrDigit(c) && !(c==' ')){
               System.out.print(c+ " ");
            }
        }
        System.out.println();
        for (int i = 0; i <s.length(); i++) {
            char c=s.charAt(i);
            if(Character.isDigit(c)){
               System.out.print(c+ " ");
            }
        }
     
    }
}
