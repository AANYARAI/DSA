import java.util.Scanner;

// public class Array{
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter the number: ");
//         int size = scanner.nextInt();

//         int[] numbers = new int[size];
//         System.out.println("Enter " + size + " integers:");
//         for (int i = 0; i < size; i++) {
//             numbers[i] = scanner.nextInt();
//         }
//         System.out.print("number entered: ");
//         for (int num : numbers) {
//             System.out.print(num + " ");
//         }
//     }
// }


















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

public class Sorting {
    public static void main(String[]args){
        int []arr ={1,2,3,5,6};
        int k = 8;
        int left = 0;
        int right = arr.length-1;
       

    while(left <= right){
        int sum = arr[left] + arr[right];
        if(sum == k){
            System.out.println("target pairs achieved for "+ k +"=" +arr[left]+","+arr[right] );
            left++;
            right--;
        }
        else if(sum < k){
            left++;
           
        }
        else{
            right--;
        }
      }    
    }
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        



    


