import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of terms for Fibonacci series: ");
        int n = input.nextInt();


        int a = 1, b = 2;

        System.out.print("Fibonacci Series up to " + n + " terms: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

          
            int nextTerm = a + b;
            a = b;
            b = nextTerm;
        }

        input.close();
    }
}

