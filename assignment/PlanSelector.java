import java.util.Scanner;

public class PlanSelector {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

      
        System.out.print("Enter the number of minutes used in a month: ");
        int minutesUsed = input.nextInt();

        System.out.print("Enter the number of messages sent in a month: ");
        int messagesSent = input.nextInt();

  
        double finalPrice = 0;

       
        if (minutesUsed <= 100 && messagesSent <= 100) {
            finalPrice = 25;  
            if (minutesUsed > 100) {
                finalPrice += (minutesUsed - 100) * 0.10;
            }
            if (messagesSent > 100) {
                finalPrice += (messagesSent - 100) * 0.05;
            }
            System.out.println("select Plan A.monthly cost is: $" + finalPrice);
        }
      
        else if (minutesUsed <= 200 && messagesSent <= 200) {
            finalPrice = 40; 
            if (minutesUsed > 200) {
                finalPrice += (minutesUsed - 200) * 0.08;
            }
            if (messagesSent > 200) {
                finalPrice += (messagesSent - 200) * 0.03;
            }
            System.out.println(" select Plan B. monthly cost is: $" + finalPrice);
        }
        
        else {
            finalPrice = 60;  
            System.out.println(" select Plan C. monthly cost is: $" + finalPrice);
        }

        input.close();
    }
}
