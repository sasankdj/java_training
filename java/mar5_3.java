//Create a java application where we have one class it contains one instance variable and a default constructor, one single parameterised constructor, one double parameterised constructor, one object parameterised constructor then invoke single under double, double under object and rest under main by providing dynamic inputs

import java.util.Scanner;

public class mar5_3 {
    static Scanner sc = new Scanner(System.in);

    int a=sc.nextInt();

    mar5_3() {
        System.out.println("in default");
    }

    mar5_3(int a) {
        System.out.println(a);
    }

    mar5_3(int a, mar5_3 o) {
        System.out.println(a + " " + o);
        // new mar5_3(sc.nextInt());
    }

    mar5_3(mar5_3 obj) {
        System.out.println(a);
        // new mar5_3(sc.nextInt(), obj);
    }
    mar5_3(int a ,int b){
        System.out.println(a+""+b);
    }
    
    public static void main(String[] args) {
        // mar5_3 obj = new mar5_3();
        // new mar5_3(obj);
    //    new mar5_3(sc.nextInt(), new mar5_3(new mar5_3()));
// new mar5_3(new mar5_3(sc.nextInt()),new mar5_3());
new mar5_3(new mar5_3(new mar5_3().sc.nextInt()).sc.nextInt(),sc.nextInt());
    }
}
