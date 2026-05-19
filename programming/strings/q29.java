public class q29{
    public static void main(String[] args) {
     String s= "java123";
     int count=0;
        for (int i = 0; i <s.length(); i++) {
            char c=s.charAt(i);
            if(Character.isLowerCase(c)){
                count++;
            }
        }
        System.out.println(count);
    }
}
