
public class q34
{
    static String reverse(String s){
        String r="";
        for(int i=s.length()-1;i>=0;i--){
            r+=s.charAt(i);
        }
        return r;
    }
    public static void main(String[] args) {
     String s= "java123 ^%* HHK";
     String r="";
     String arr[]=s.split(" ");
       
        for (String st : arr) {
            System.out.print(reverse(st)+" ");
        }      
    }
}
