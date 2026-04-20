public class apr20_4 {
    public static void main(String[] args) {
        int n=5;
        
        for(int i=1;i<=n;i++){
            // char c='A';
            for(int j=65;j<=65+i-1;j++){
                System.out.print((char)j +" ");
            }
            for(int j=1;j<=2*(n-i)-1;j++){
                System.out.print("  ");
            } 
            for(int j=65+i-1;j>=65;j--){
                if(i==n && j==65+i-1){

                }
                else
                System.out.print((char)j +" ");
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            // char c='A';
            for(int j=65;j<=65+i-1;j++){
                System.out.print((char)j +" ");
            }
            for(int j=1;j<=2*(n-i)-1;j++){
                System.out.print("  ");
            } 
            for(int j=65+i-1;j>=65;j--){
                System.out.print((char)j +" ");
            }
            System.out.println();
        }
    }
}
