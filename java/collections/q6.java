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
        Collections.sort(al);
        System.out.println(al);

    }
}
