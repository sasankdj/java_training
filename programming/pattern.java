public class pattern {
    public static void main(String[] args) {
        int n=4;
        // for(int i=1;i<=n;i++){
        //     for (int j=1;j<=n-i;j++){
        //         System.out.print("1");
        //     }
        //     for(int k=1;k<=i;k++){
        //         System.out.print(i);
        //     }
        //     System.out.println();
        // }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j-i<=2)
                System.out.print("1");

                // System.out.print(i);
            }
            System.out.println();
        }
    }
}
