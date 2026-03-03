//create a java application where we have 1 class it contains 1 instance var and a  parameterized constructor then invoke these props under main method
import java.util.*;
public class mar2_2 {
    static Scanner sc= new Scanner(System.in);
    int a;
    mar2_2(int a){
        System.out.println("in parameterized constructor");
        this.a=a;
        
    }
    public static void main(String[] args) {
      mar2_2  obj = new mar2_2(sc.nextInt());
      System.out.println(obj.a);
        
    }
}
