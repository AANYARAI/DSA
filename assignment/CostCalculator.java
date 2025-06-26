import java.util.Scanner;

public class CostCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       
        System.out.print("Enter package weight:");
        double weight = input.nextDouble();

        System.out.print("Enter shipping distance: ");
        double distance = input.nextDouble();

        double cost;

        // Check shipping conditions
        if (weight <= 10 && distance <= 100) {
            cost = 5;
        } else if ((weight > 10 && weight <= 20) || (distance > 100 && distance <= 500)) {
            cost = 10;
        } else {
            cost = 20;
        }

        // Show result
        System.out.println("Shipping cost is: $" + cost);

        input.close();
    }
}
