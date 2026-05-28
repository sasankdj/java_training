public class q7 {
    public static void main(String[] args) {
        int arr[][] = { { 2, 3, 5 }, { 2, 3, 4 }, { 6, 7, 8 } };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {

            sum += arr[i][i];

        }
        System.out.println("first diagonal" + sum);
        sum = 0;
        for (int i = 0; i < arr.length; i++) {

            sum += arr[i][arr.length-i-1];

        }
        System.out.println("second diagonal" + sum);
    }
}
