public class apr20_3 {
    public static void main(String[] args) {
        int n=5,c=0,d=1;

        for(int i=1;i<=n;i++){
            c=c+i;
            d=c;
            for(int j=i;j<=n-1;j++){
                System.out.print(c+" ");
                c=c+j;
            }
            
            for(int j=n-1;j>=n-i;j--){
                System.out.print(c+" ");
                c=c+j;
            }
            System.out.println();
            c=d;
        }
    }
}
