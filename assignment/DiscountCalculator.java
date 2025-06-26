
import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of items:");
        int items = input.nextInt();

        System.out.println("Enter total price:");
        double price = input.nextDouble();

        double discount;

        if (price > 100 && items > 5) {
            discount = price * 0.10;
        } else if (price >= 50 && price <= 100) {
            discount = price * 0.05;
        } else {
            discount = 0;
        }

        double finalPrice = price - discount;

        System.out.println("Discount is: $" + discount);
        System.out.println("Final price is: $" + finalPrice);

        input.close();
    }
}
