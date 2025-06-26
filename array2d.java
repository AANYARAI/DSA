// public class array2d {
//     public static void main(String[]args){
//         int [][] arr = new int [a][b];

//         int i=2;
//         int j=2;

//         for(i=0;i<2;i++){
//             for(j=0;j<2;j++){
//                 System.out.println(arr[i][j]);
//             }
//         }
//     }
// }
import java.util.Scanner;

public class array2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int a = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int b = sc.nextInt();

    
        int[][] arr = new int[a][b];

       
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        //
        System.out.println("The 2D array is:");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); 
        }

        sc.close();
    }
}

