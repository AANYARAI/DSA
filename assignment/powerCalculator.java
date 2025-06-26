import java.util.Scanner;

public class powerCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter base (a): ");
        int a = input.nextInt();

        System.out.print("Enter exponent (b): ");
        int b = input.nextInt();

        int result = 1;

        for (int i = 1; i <= b; i++) {
            result *= a;
        }

        System.out.println("Result: " + result);
        input.close();
    }
}
