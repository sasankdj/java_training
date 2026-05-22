import java.util.*;
class extra1{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,1,4,2,4,6,7,8};
        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<Integer> dup = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (!al.contains(arr[i])) {
                al.add(arr[i]);
            }
            else{
                if(!dup.contains(arr[i])){
                    dup.add(arr[i]);
                }
            }
        }
        for (Integer i : al) {
            if(!dup.contains(i)){
                System.out.print(i+ " ");
            }
        }
        System.out.println();
        for (Integer i : al) {
            if(dup.contains(i)){
                System.out.print(i+" ");
            }
        }
        

    }
}