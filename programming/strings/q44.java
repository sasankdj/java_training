
public class q44 {
    public static void main(String[] args) {
        String s= "java java  with wi";
        s=s.replaceAll("\\s+", " ");
        String arr[]= s.split(" ");
        
        

       for(int i=0;i<arr.length;i++){
        int fc=0,ir=0;
        for (int j = 0; j < arr.length; j++) {
            if(arr[i].equals(arr[j])){
                fc++;
            }
        }
        for (int j = i+1; j < arr.length; j++) {
            if(arr[i].equals(arr[j]))
            ir++;
        }
       if(ir==1){

           System.out.println(arr[i]+"  "+fc);
       }
    }
    }
}
