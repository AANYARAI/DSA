
public class mostFrequent {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 1, 4, 1};
        int maxCount = 0;
        int mostFrequent = arr[0];

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                mostFrequent = arr[i];
            }
        }

        System.out.println("Most frequent element (Brute Force): " + mostFrequent);
    }
}
