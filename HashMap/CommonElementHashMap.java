package HashMap;

import java.util.HashSet;

public class CommonElementHashMap {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 3};

        HashSet<Integer> set = new HashSet<>();
        for (int num : arr1) {
            set.add(num);
        }
        boolean found = false;
        for (int num : arr2) {
            if (set.contains(num)) {
                found = true;
                System.out.println("Common element found: " + num);
                break;
            }
        }

        if (!found) {
            System.out.println("No common elements found.");
        }
    }
}

