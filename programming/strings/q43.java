
public class q43 {
    public static void main(String[] args) {
        String s= "java java  with wi";
        s=s.replaceAll("\\s+", " ");
        String arr[]= s.split(" ");
        int min=Integer.MIN_VALUE;
        String mi=" ";

       for(int i=0;i<arr.length;i++){
        int fc=0;
        for (int j = 0; j < arr.length; j++) {
            if(arr[i].equals(arr[j])){
                fc++;
            }
        }
        if(fc==1){
            if(arr[i].length()>min){
                min=arr[i].length();
                mi=arr[i];
            }
        }
    }
    System.out.println(mi);
    }
}
