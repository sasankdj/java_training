import java.util.Scanner;

public class p2 {
    String name;
    String brand;
    String model;
    String colour;

    p2(String name, String brand, String model, String colour) {
        this.name = name;
        this.brand = brand;
        this.model = model;
        this.colour = colour;
    }

    p2(p2 o) {
        System.out.println(name + brand + model + colour);
        name = o.name;
        brand = o.brand;
        model = o.model;
        colour = o.colour;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        p2 obj = new p2(sc.next(), sc.next(), sc.next(), sc.next());
        p2 obj1 = new p2(obj);
        System.out.println(obj1.name);
        System.out.println(obj1.brand);
        System.out.println(obj1.model);
        System.out.println(obj1.colour);
        System.out.println(obj.name);
        System.out.println(obj.brand);
        System.out.println(obj.model);
        System.out.println(obj.colour);

    }
}
