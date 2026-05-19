public class q27 {
    public static void main(String[] args) {
     String s= "java 123";
     
        for (int i = 0; i <s.length(); i++) {
            char c=s.charAt(i);
            if(Character.isDigit(c)){
                System.out.println(c+" "+i);
            }
        }
    }
}
