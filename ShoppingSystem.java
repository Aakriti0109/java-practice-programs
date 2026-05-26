import java.util.Scanner;

class Product {
    String name;
    int price;

    Product(String name, int price) {
        this.name = name;
        this.price = price;
    }
}

public class ShoppingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Product list
        Product[] products = {
            new Product("Shirt", 500),
            new Product("Jeans", 1200),
            new Product("Shoes", 2000),
            new Product("Bag", 800)
        };

        int total = 0;
        int choice;

        do {
            System.out.println("\n Available Products:");
            for (int i = 0; i < products.length; i++) {
                System.out.println((i + 1) + ". " + products[i].name + " - ₹" + products[i].price);
            }

            System.out.println("Enter product number to add to cart (0 to exit): ");
            choice = sc.nextInt();

            if (choice > 0 && choice <= products.length) {
                total += products[choice - 1].price;
                System.out.println(products[choice - 1].name + " added to cart ");
            }

        } while (choice != 0);

        System.out.println("\nTotal Bill: ₹" + total);
        System.out.println("Thank you for shopping! ");

        sc.close();
    }
}