
public class q9 {
    static boolean identity(int arr[][]){
         for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(i==j){
                    if(arr[i][j]!=1){
                        return false;
                    }
                    
                }
                else{
                    if(arr[i][j]!=0){
                        return false;
                    }
                }
            }
       }
       return true;
    }
    public static void main(String[] args) {
        int arr[][] =  {{1,0,0},{0,1,0},{0,0,1}};
       if(identity(arr)){
        System.out.println("identity");
       }
       else
        System.out.println("not a identity");
      
    }
}
