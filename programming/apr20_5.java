public class apr20_5 {
    public static void main(String[] args) {
        int n=4;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                if(j>i)
                    System.out.print(i+" ");
                else
                System.out.print(j+" ");
            }
            for (int j = n-1; j >=1; j--) {
                if(j>i)
                    System.out.print(i+" ");
                else
                System.out.print(j+" ");
            }
            System.out.println();
            
        }
        for (int i = n-1; i >=1; i--) {
            for (int j = 1; j <=n; j++) {
                if(j>i)
                    System.out.print(i+" ");
                else
                System.out.print(j+" ");
            }
            for (int j = n-1; j >=1; j--) {
                if(j>i)
                    System.out.print(i+" ");
                else
                System.out.print(j+" ");
            }
            System.out.println();
            
        }
    }
}
