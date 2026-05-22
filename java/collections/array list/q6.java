import java.util.ArrayList;

import java.util.Collections;
import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList <Integer> al= new ArrayList<>();
        for (int i = 0; i <3; i++) {
            al.add(sc.nextInt());
        } 
        // Collections.sort(al);
        for (int i = 0; i < al.size(); i++) {
            for (int j = i+1; j <al.size(); j++) {
                if(al.get(i)>al.get(j)){
                    int temp= al.get(i);
                    al.set(i, al.get(j));
                    al.set(j,temp);
                }
            }
        }
        System.out.println(al);

    }
}
