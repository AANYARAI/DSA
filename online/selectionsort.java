// public class selectionsort {
// static int[] sort(int[] arr){
// for (int i=0;i<arr.length;i++){
//     int min = arr[i];

//     for (int j =i+1;j<arr.length;j++){
//         if(arr[j]<min){
//             min =arr[j];

//         }
//     }
//     int temp = arr[i];
//     arr[i] =  min;
//     min = temp;
// }
// return arr;
// }

// }

// import java.util.Arrays;

// public class selectionsort {
//     static int[] sort(int[] arr) {
//         for (int i = 0; i < arr.length; i++) {
//             int minIndex = i;

//             for (int j = i + 1; j < arr.length; j++) {
//                 if (arr[j] < arr[minIndex]) {
//                     minIndex = j;
//                 }
//             }

           
//             int temp = arr[i];
//             arr[i] = arr[minIndex];
//             arr[minIndex] = temp;
//         }
//         return arr;
//     }
//         public static void main(String[] args) {
//         int[] arr = {4, 2, 7, 1, 3};
//         int[] sorted = sort(arr);
//         System.out.println("Sorted Array : " + Arrays.toString(sorted));
//     }

// }

import java.util.Arrays;

public class selectionsort {
    static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int maxIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }

           
            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 1, 3};
        int[] sorted = sort(arr);
        System.out.println("Sorted Array is: " + Arrays.toString(sorted));
    }
}


