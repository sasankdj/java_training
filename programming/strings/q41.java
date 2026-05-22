
public class q41 {
    public static void main(String[] args) {
        String s= "java java  with";
        s=s.replaceAll("\\s+", " ");
        String arr[]= s.split(" ");
       for(int i=0;i<arr.length;i++){
        int fc=0;
        for (int j = 0; j < arr.length; j++) {
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
