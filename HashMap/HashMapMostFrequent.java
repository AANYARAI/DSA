

import java.util.HashMap;
import java.util.Map;

public class HashMapMostFrequent {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 1, 4, 1};
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        int maxCount = 0;
        int mostFrequent = arr[0];

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostFrequent = entry.getKey();
            }
        }

        System.out.println("Most frequent element (HashMap): " + mostFrequent);
    }
}

