import java.util.Scanner;

public class Array{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.print("number entered: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}


















// public class sorting{
//     public static void main(String[] args) {
//         int []arr = { 1,2,3,5,6};
//         int k= 8;
//         int i=0;
//       int j=n-i;
//        for (int i; i<n;) {
//            if (arr[i]+arr[j]>k){
//             i++;
//             // System.out.println("Pair found: " + nums[i] + " + " + nums[j] + " = " + k);
//            }
//            else(arr[i]+arr[j]>k){
//             j--;
//            }
//        }
           
//         }

//         }


    


