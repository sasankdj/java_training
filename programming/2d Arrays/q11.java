public class q11 {
    public static void main(String[] args) {
        int arr[][]= {{2,3,4},{2,3,4},{2,3,4}};
        boolean row=true,col=true;
        
        for (int i = 0; i < arr.length; i++) {
                  
            for (int j = 1; j < arr.length; j++) {
                if(arr[i][j]!=arr[i][0]){
                    row=false;
                    break;
                }
            }
            for (int j = 1; j < arr.length; j++) {
                if(arr[j][i]!=arr[0][i]){
                    col=false;
                    break;
                }
            }
            
        }
        if(col) System.out.println("col are equal");
        if(row) System.out.println("row are equal");

    }
}
