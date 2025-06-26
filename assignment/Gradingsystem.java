
import java.util.Scanner;

public class Gradingsystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
          
        System.out.print("Enter first subject score: ");
        int score1 = input.nextInt();

        System.out.print("Enter second subject score: ");
        int score2 = input.nextInt();

        System.out.print("Enter third subject score: ");
        int score3 = input.nextInt();

        int average = (score1 + score2+ score3)/3;

        String grade ;
        if (average >=90){
            grade = "A";
        }
        else if (average >=80){
            grade = "B";
        }
        else if (average >=70){
            grade = "C";
        }
        else if (average >=60){
            grade = "D";
        }
        else {
            grade = "F";
        }

        System.out.println("average score is :" + average);
        System.out.println("grade is :" +  grade);
        input.close();



    }
}
