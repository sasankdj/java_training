import java.util.ArrayList;

public class q4 {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            if(i%2==0){
                al1.add(i);
            }
            if(i%3==0)
                al2.add(i);
        }
        for (Integer i : al1) {
            if(al2.contains(i)){
                System.out.print(i+" ");
            }
        }
    }
}
