public class q49 {
    public static void main(String[] args) {
        String s="a a  a ";
        String arr[]=s.split("\\s+");
        int n=3;
        for (String string : arr) {
            int fc=0;
            for (String string2 : arr) {
                if(string.equals(string2)){
                    fc++;
                }
            }
            if(fc==n){
                System.out.print(string);
                break;
            }
        }
    }
}
