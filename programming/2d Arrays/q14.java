public class q14 {
    public static void main(String[] args) {
        int m1[][]={{1,1,2},{1,2,2},{2,1,2}};
       int sum=0;
        for (int i = 0; i < m1.length; i++) {
            
                sum+=m1[i][i];
            
            }
            System.out.println(sum);
    }   
}
