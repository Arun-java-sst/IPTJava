package iptstring;

public class Stringhighest {
    public static void main(String[] args) {
        String[] products = {
            "Product Type = Electricals & Product = Fan = $20.99",
            "Product Type = Kitchen Utilities & Product = Oven = $33.00",
            "Product Type = Electricals & Product = Light = $5.26",
            "Product Type = Decor & Product = Desk organizer = $18.88",
            "Product Type = Kitchen Utilities & Product = Toaster = $11.23",
            "Product Type = Dress & Product = Tie = $8.99",
            "Product Type = Electricals & Product = TV = $40.66",
            "Product Type = Electricals & Product = Laptop = $49.99"
        };
        double total = 0;
        double maxPrice = 0;
        String highestProduct = "";
        for (String product : products) {
            // Extract the price
            int dollarIndex = product.lastIndexOf("$");
            double price = Double.parseDouble(
                product.substring(dollarIndex + 1)
            );
            // Calculate total price
            total = total + price;
            // Find Electricals products
            if (product.contains("Product Type = Electricals")) {
                if (price > maxPrice) {
                    maxPrice = price;
                    // Extract product name
                    int start = product.indexOf("Product = ") + 10;
                    int end = product.lastIndexOf(" = $");
                    highestProduct = product.substring(start, end);
                }
            }
        }
        System.out.println(
            "Highest-priced Electrical product: " + highestProduct
        );
        System.out.println(
            "Highest Electrical product price: $" + maxPrice
        );
        System.out.printf("Total price of all products: $%.2f%n", total);
    }
}

