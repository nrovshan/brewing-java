package b_java_basics.types_and_expressions.week1day3;

public class coffeeShopReceipt {
    public static void main(String[] args) {
        //declare variables
        double lattePrice = 5.50;
        int quantity = 3;
        double taxRate = 0.08;

        //calculate
        double subtotal = lattePrice * quantity;
        double tax = subtotal * taxRate;
        double total = subtotal + tax;

        System.out.println("Receipt Summary:");
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Tax: " + tax);
        System.out.println("Total: " + total);

    }
}