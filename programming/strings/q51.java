public class q51 {
    public static void main(String[] args) {
        String s1="sasank sasak";
        String s2="adf sasank";
        String arr1[]=s1.split("\\s+");
        String arr2[]=s2.split("\\s+");
        for (String st1 : arr1) {
            for (String st2 : arr2) {
                if(st1.equals(st2)){
                    System.out.println(st1);
                }
                
            }
        }


    }
}
