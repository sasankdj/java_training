public class apr20_2 {
    public static void main(String[] args) {
        int n=5;
        int c=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                // int c2=n*i;
                    if(i%2==1){
                        System.out.print(c);
                    }
                    else{
                        System.out.print((n*i)-j+1);
                        // c2--;
                    }
                    c++;
            }
            System.out.println();
        }
    }
}
