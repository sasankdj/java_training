
public class q10 {
    static int identity(int arr[][]){
        int n= arr[0][0];
         for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(i==j){
                    if(arr[i][j]!=n){
                        return -1;
                    }
                    
                }
                else{
                    if(arr[i][j]!=0){
                        return -1;
                    }
                }
            }
       }
       return n;
    }
    public static void main(String[] args) {
        int arr[][] =  {{7,0,0},{0,7,0},{0,0,7}};
       if(identity(arr)==-1){
           System.out.println("not a identity");
        }
        else
            System.out.println(identity(arr)+" identity");
      
    }
}
