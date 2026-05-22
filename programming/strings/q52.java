public class q52 {
    public static void main(String[] args) {
        String s1="sasank sasak sasank adf";
        String s2="adf sasank";
        String arr1[]=s1.split("\\s+");
        String arr2[]=s2.split("\\s+");
        
        for (int i = 0; i <arr1.length; i++) {
            int fc=0;
            boolean flag=true;
            for (int j = 0; j < i; j++) {
                if(arr1[i].equals(arr1[j])){
                    flag=false;
                }
            }
            if(!flag){
                continue;
            }
            for (int j = 0; j < arr2.length; j++) {
                if(arr1[i].equals(arr2[j])){
                    fc++;
                }
            }
            if(fc>0){
                System.out.println(arr1[i]);
            }
            
        }


    }
}
