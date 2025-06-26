
import java.util.Scanner;

public class LateFees {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.print("Enter number of days overdue: ");
        int days = input.nextInt();
        input.nextLine(); // Consume leftover newline

        System.out.print("Enter type of book (regular, fiction, reference): ");
        String bookType = input.nextLine();

        double fee = 0;

        if 
        (bookType.equals("regular")) {
            fee = days * 0.50;
        } else if (bookType.equals("fiction")) {
            fee = days * 0.75;
        } else if (bookType.equals("reference")) {
            fee = 0;
        } else {
            System.out.println("Invalid book type.");
            input.close();
            return;
        }

        System.out.println("Late fee is: $" + fee);

        input.close();
    }
}

