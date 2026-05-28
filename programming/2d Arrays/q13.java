public class q13 {
    public static void main(String[] args) {
        int m1[][]={{1,1,2},{1,2,2},{2,1,2}};
        int m2[][]={{1,1,2},{1,2,2},{2,1,2}};
        for (int i = 0; i < m2.length; i++) {
            for (int j = 0; j < m2.length; j++) {
                System.out.print(m1[i][j]*m2[j][i]+" ");
            }
            System.out.println();
        }
    }   
}
