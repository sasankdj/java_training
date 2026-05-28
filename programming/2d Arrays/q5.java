public class q5 {
    public static void main(String[] args) {
         int arr[][]={{2,3,4},{2,3,4},{6,7,8}};
        int sum=0,c=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum+=arr[i][j];
                c++;
            }
        }
        float avg= (float)sum/c;
        System.out.println(avg);
    }
}
