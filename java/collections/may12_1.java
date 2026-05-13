import java.util.ArrayList;
import java.util.Scanner;

class may12_1{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();
        for (int index = 0; index < 3; index++) {
            
            al.add(sc.nextInt());
        }
        System.out.println(al);
    }
}