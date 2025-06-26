import java.util.HashSet;

public class TwoSumChecker {
    public static boolean hasTwoSum(int[] arr, int target) {
        HashSet<Integer> seen = new HashSet<>();

        for (int num : arr) {
            int complement = target - num;
            if (seen.contains(complement)) {
                System.out.println("Match found: " + num + " + " + complement + " = " + target);
                return true;
            }
            seen.add(num);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = {3, 5, 1, 7, 9};
        int target = 10;

        if (!hasTwoSum(nums, target)) {
            System.out.println("No pair found that adds up to " + target);
        }
    }
}

