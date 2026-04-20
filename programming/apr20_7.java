public class apr20_7 {
    public static void main(String[] args) {
        int n=6;
        for (int i = 1; i <=n; i++) {
            int sum=i;
            for (int j = 1; j <=i; j++) {
                System.out.print(sum+" ");
                if (j%2==1) {
                    int odd=1;
                    for (int k = 1; k <=n-i+1 ; k++) {
                        if (k!=1) {
                            odd+=2;
                        }
                    }
                    sum+=odd;
                }
                else{
                    int even=2*(i-j);
                    sum+=even;
                }
            }
            System.out.println();
        }
    }
}
