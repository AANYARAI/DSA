import java.util.Arrays;

public class insertionsort {
    static int[] sort(int[] arr){
        for (int i=0;i<arr.length;i++){
           
            int key=arr[i];
             int j=i-1;

            while(j>=0  && key<arr[j]){
                arr[j+1] =arr[i];
                j--;
            }
            arr[j+i]=key;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 3};
        int[] sorted = sort(arr);
        System.out.println("Sorted Array is: " + Arrays.toString(sorted));
    }
}
