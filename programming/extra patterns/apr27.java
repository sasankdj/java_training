public class apr27 {
    public static void main(String[] args) {
       int n=6;
       for(int i=1;i<=n;i++){
        int sum=i;
        for(int j=1;j<=i;j++){
            System.out.print(sum+" ");
            if(i%2==1){
                sum+=(1+2*(n-i));
            }
            else{
                sum+=2*(i-j);
            }
        }
        System.out.println();
       }
    }
}
