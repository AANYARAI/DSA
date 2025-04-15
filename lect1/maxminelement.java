public class maxminelement {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 1, 5, 9, 2};
        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if(arr[i]<max){
                min=arr[i];
            }
        }

        System.out.println("Maximum element in the array is: " + max);
        System.out.println("Minimum element in the array is: " + min);
    }
}
