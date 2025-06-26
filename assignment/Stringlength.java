import java.util.Scanner;

public class Stringlength {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a String:");
        String text = input.nextLine();

        int length = text.length();

        System.out.println("The length of the string is: " + length);

        input.close();
    }
}
