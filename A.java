import java.util.Scanner;

class User {
    String username;
    String password;

    User(String u, String p) {
        username = u;
        password = p;
    }
}

class Product {
    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

class Cart {
    Product[] items = new Product[10];
    int count = 0;

    void addProduct(Product p) {
        if (count < 10) {
            items[count++] = p;
            System.out.println("Product added to cart!");
        } else {
            System.out.println("Cart is full!");
        }
    }

    void viewCart() {
        if (count == 0) {
            System.out.println("Cart is empty!");
            return;
        }

        double total = 0;
        System.out.println("\n--- Cart Items ---");
        for (int i = 0; i < count; i++) {
            System.out.println(items[i].name + " - ₹" + items[i].price);
            total += items[i].price;
        }
        System.out.println("Total: ₹" + total);
    }

    void checkout() {
        if (count == 0) {
            System.out.println("Cart is empty!");
            return;
        }

        viewCart();
        System.out.println("Order placed successfully!");
        count = 0;
    }
}

public class A {

    static Scanner sc = new Scanner(System.in);

    static User[] users = new User[10];
    static int userCount = 0;

    static Product[] products = new Product[10];
    static int productCount = 0;

    static void register() {
        System.out.print("Enter username: ");
        String u = sc.next();
        System.out.print("Enter password: ");
        String p = sc.next();

        users[userCount++] = new User(u, p);
        System.out.println("Registration successful!");
    }

    static User login() {
        System.out.print("Enter username: ");
        String u = sc.next();
        System.out.print("Enter password: ");
        String p = sc.next();

        for (int i = 0; i < userCount; i++) {
            if (users[i].username.equals(u) && users[i].password.equals(p)) {
                System.out.println("Login successful!");
                return users[i];
            }
        }

        System.out.println("Invalid credentials!");
        return null;
    }

    static void addProduct() {
        System.out.print("Enter product id: ");
        int id = sc.nextInt();
        System.out.print("Enter product name: ");
        String name = sc.next();
        System.out.print("Enter price: ");
        double price = sc.nextDouble();

        products[productCount++] = new Product(id, name, price);
        System.out.println("Product added!");
    }

    static void viewProducts() {
        if (productCount == 0) {
            System.out.println("No products available!");
            return;
        }

        System.out.println("\n--- Products ---");
        for (int i = 0; i < productCount; i++) {
            System.out.println(products[i].id + ". " + products[i].name + " - ₹" + products[i].price);
        }
    }

    static Product getProductById(int id) {
        for (int i = 0; i < productCount; i++) {
            if (products[i].id == id) {
                return products[i];
            }
        }
        return null;
    }

    static void userMenu(User user) {
        Cart cart = new Cart();

        while (true) {
            System.out.println("\n1. View Products");
            System.out.println("2. Add to Cart");
            System.out.println("3. View Cart");
            System.out.println("4. Checkout");
            System.out.println("5. Logout");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    viewProducts();
                    break;

                case 2:
                    viewProducts();
                    System.out.print("Enter product id: ");
                    int id = sc.nextInt();
                    Product p = getProductById(id);

                    if (p != null) {
                        cart.addProduct(p);
                    } else {
                        System.out.println("Invalid product!");
                    }
                    break;

                case 3:
                    cart.viewCart();
                    break;

                case 4:
                    cart.checkout();
                    break;

                case 5:
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    static void adminMenu() {
        while (true) {
            System.out.println("\n--- Admin ---");
            System.out.println("1. Add Product");
            System.out.println("2. View Users");
            System.out.println("3. View Products");
            System.out.println("4. Logout");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addProduct();
                    break;

                case 2:
                    for (int i = 0; i < userCount; i++) {
                        System.out.println(users[i].username);
                    }
                    break;

                case 3:
                    viewProducts();
                    break;

                case 4:
                    return;

                default:
                    System.out.println("Invalid!");
            }
        }
    }

    public static void main(String[] args) {

        // Preload products
        products[productCount++] = new Product(1, "Laptop", 50000);
        products[productCount++] = new Product(2, "Phone", 20000);
        products[productCount++] = new Product(3, "Headphones", 2000);

        while (true) {
            System.out.println("\n--- E-Commerce System ---");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Admin Login");
            System.out.println("4. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    register();
                    break;

                case 2:
                    User user = login();
                    if (user != null) {
                        userMenu(user);
                    }
                    break;

                case 3:
                    System.out.print("Enter admin password: ");
                    String adminPass = sc.next();

                    if (adminPass.equals("admin123")) {
                        adminMenu();
                    } else {
                        System.out.println("Wrong password!");
                    }
                    break;

                case 4:
                    System.out.println("Thank you!");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}