import java.util.Scanner;
public class ConcatenateStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter First text");
        String Text1 = input.nextLine();

        System.out.println("Enter Second text");
        String Text2 = input.nextLine();

        
        System.out.println("Enter Second text");
        String Text3 = input.nextLine();

        String Total = Text1+" "+Text2+" "+Text3;

        System.out.println("Concatenated string: " + Total);

        input.close();
    }
}
