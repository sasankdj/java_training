public class q31
{
    public static void main(String[] args) {
     String s= "java123 ^%* HHK";
     String res="";
        for (int i = 0; i <s.length(); i++) {
            char c=s.charAt(i);
          

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

        System.out.println(res);
       
     
    }
}
