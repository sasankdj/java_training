//cja remove 4 multiples


import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class may15_2 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(1,2,3,4));
        // for (int i = 0; i <al.size(); i++) {
        //     if(al.get(i)%4==0){
        //         al.remove(al.get(i));
        //         i--;
        //     }
        // }   
        // System.out.println(al);
//2nd method
        // Predicate<Integer> p=(x)-> x%4==0;
        // for (int i = 0; i < al.size(); i++) {
        //     if(p.test(al.get(i))){
        //         al.remove(al.get(i));
        //         i--;
        //     }
        // }
        // System.out.println(al);
//3rd method
//over ride the test method in predicate  public boolean test(predicate)

        al.removeIf((x)-> x%4==0);
        System.out.println(al);

    }
}
