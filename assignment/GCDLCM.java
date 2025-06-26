import java.util.Scanner;

public class GCDLCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = input.nextInt();

        System.out.print("Enter second number: ");
        int b = input.nextInt();
        int gcd = 1;
        // int min = (a < b) ? a : b;  

        for (int i = 1; i <=a && i<=b; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        int lcm = (a * b) / gcd;

     
        System.out.println("GCD is: " + gcd);
        System.out.println("LCM is: " + lcm);

        input.close();
    }
}
