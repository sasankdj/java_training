public class apr20_1{
    public static void main(String[] args) {
        int n=5;
        int c=1;
        int d=1;
        for(int i=n+1;i>=2;i--){
            
            if(i!=n+1){
                c=c+i;
                d=c;
            }
            for(int j=i-1;j<=n;j++){
                System.out.print(c+" ");
                c=c-j;
            }
            System.out.println(); 
            c=d;
        }
    }
}