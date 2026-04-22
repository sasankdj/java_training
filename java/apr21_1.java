//cja where we need to take command line arguements and then print the summation of that arguemnts, if any exception occur in this process handle it
public class apr21_1 {
    public static void main(String[] args) {
        int sum=0;
        try {
            for (String o : args) {
                
                sum += Integer.parseInt(o);
            }
            System.out.println(sum);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
    }
}
