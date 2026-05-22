public class q53 {
    public static void main(String[] args) {
         String s1="sasank sasak sasank adf";
        String s2="adf sasank";
        String s3=s1+" "+s2;
        String arr[]=s3.split("\\s+");
       
        for (int i = 0; i < arr.length; i++) {
            int fc=0;
            for (int j = i; j < arr.length; j++) {
                if(arr[i].equals(arr[j])){
                    fc++;
                }
            }
            if(fc==1){
                System.out.println(arr[i]);
            }

        }
    }
}
