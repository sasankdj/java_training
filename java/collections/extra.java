import java.util.*;

public class extra {
    public static void main(String[] args) {
        Integer arr[]= {10,7,11,5,4,6,12,10,11,11,9,4};
        ArrayList <Integer> al = new ArrayList<>(Arrays.asList(arr));
        for (int i=0;i<al.size();i++) {
            int fc=0;
            for (int j = 0; j < arr.length; j++) {
                if(al.get(i).equals(al.get(j))){
                    fc++;
                }
            }
            if(fc==1){
                System.out.print(al.get(i)+" ");
            }
        }
        System.out.println();
        for (int i=0;i<al.size();i++) {
            int fc=0;
            for (int j = i+1; j < arr.length; j++) {
                if(al.get(i).equals(al.get(j))){
                    fc++;
                }
            }
            if(fc==1){
                System.out.print(al.get(i)+" ");
            }
        }

    }

}
