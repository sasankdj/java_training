import java.util.Scanner;

class Restaurant {
    static Scanner sc = new Scanner(System.in);

    double cb(int q) {
        return q * 200;
    }

    double mb(int q) {
        return q * 300;

    }

    double vb(int q) {
        return q * 100;
    }
}

class Swiggy extends Restaurant {
    double amount = 0;
    double bill = 0;

    void display() {
        System.out.println("choose a menu \n 1.chicken biryani \n 2.mutton biryani \n 3.veg biryani");
    }

     void billing() {
        if (bill > 0) {
            double discount = bill * 0.10;
            double gst = (bill - discount) * 0.18;
            amount = (bill - discount) + gst + 100;
            // System.out.println("the bill amount is" + bill + "-discount" + discount + "+gst" + gst
            //         + "+ delivery fee(100) = total" + amount);
            System.out.println("total bill"+bill);
            System.out.println("discount-"+discount);
            System.out.println("gst- "+gst);
            System.out.println("delivery fee-100rs");
            System.out.println("total amount is" + amount);
        } else {
            System.out.println("please order something cart looking empty :(");
        }
    }

    void order() {
        display();
        int c = sc.nextInt();
        if (c == 1) {
            System.out.println("enter a quantity :");
            bill += cb(sc.nextInt());
        } else if (c == 2) {
            System.out.println("enter a quantity :");
            bill += mb(sc.nextInt());

        } else if (c == 3) {
            System.out.println("enter a quantity :");
            bill += vb(sc.nextInt());
        }
        System.out.println("enter a choice \n 1.to order again  \n 2.to continue billing ");
        int ch = sc.nextInt();
        if (ch == 1)
            order();
        else if (ch == 2)
            billing();
        else
            System.out.println("invalid input");

    }
}

class Zomato extends Restaurant {
    double amount = 0;
    double bill = 0;

    void display() {
        System.out.println("choose a menu \n 1.chicken biryani \n 2.mutton biryani \n 3.veg biryani");
    }

    void billing() {
        if (bill > 0) {
            double discount = bill * 0.10;
            double gst = (bill - discount) * 0.18;
            amount = (bill - discount) + gst + 100;
            System.out.println("total bill"+bill);
            System.out.println("discount-"+discount);
            System.out.println("gst- "+gst);
            System.out.println("delivery fee-100rs");
            System.out.println("total amount is" + amount);
        } else {
            System.out.println("please order something cart looking empty :(");
        }
    }

    void order() {
        display();
        int c = sc.nextInt();
        if (c == 1) {
            System.out.println("enter a quantity :");
            bill += cb(sc.nextInt());
        } else if (c == 2) {
            System.out.println("enter a quantity :");
            bill += mb(sc.nextInt());

        } else if (c == 3) {
            System.out.println("enter a quantity :");
            bill += vb(sc.nextInt());
        }
        System.out.println("enter a choice \n 1.to order again  \n 2.to continue billing ");
        int ch = sc.nextInt();
        if (ch == 1)
            order();
        else if (ch == 2)
            billing();
        else
            System.out.println("invalid input");

    }
}

public class mar14_2_hierarchial_real {
    public static void main(String[] args) {
        System.out.println("enter a choice to choose platform \n 1. for swiggy \n 2.for zomato ");
        // int c = sc.nextInt();
        int c= Restaurant.sc.nextInt();
        if (c == 1) {

            Swiggy obj = new Swiggy();
            obj.order();

        } else if (c == 2) {
            Zomato obj = new Zomato();
            obj.order();
        }
        else{
            System.out.println("invalid choice please try again :(");
            main(args);
        }

    }
}
