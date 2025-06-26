// package HashMap;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4};
        Map<Integer, Integer> map = new HashMap<>();

        for (int i=0;i<arr.length;i++) {
            map.put(arr[i], true); 
        }
        System.out.println("Array after removing duplicates: " + map.keySet());
    }
}
