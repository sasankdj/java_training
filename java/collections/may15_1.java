// create a arraylist with array list as generic add some values to it and print the list

import java.util.ArrayList;

public class may15_1 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        ArrayList<Integer> al1= new ArrayList<>();
        al1.add(10);
        al.add(al1);
        for (ArrayList<Integer> i :al) {
            for (Integer x :i) {
                System.out.println(x);
            }
            System.out.println();
        }

    }
}
