public class q32
{
    public static void main(String[] args) {
     String s= "java123 ^%* HHK";
     String res="";
        for (int i = 0; i <s.length(); i++) {
            char c=s.charAt(i);
            if(i%2==0){

                if(Character.isLowerCase(c)){
                    res+=Character.toUpperCase(c);
                }
                else if(Character.isUpperCase(c)){
                    res+=Character.toLowerCase(c);
                }
                else{
                    res+=c;
                }
            }
            else{
                res+=c;
            }
        }

        System.out.println(res);
       
     
    }
}
