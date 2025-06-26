
public class loop1 {
    public static void main(String[] args) {
        int[] nums = {3,2,1,6,5};
        int k = 8;
        boolean found = false;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == k) {
                    System.out.println("Pair found: " + nums[i] + " + " + nums[j] + " = " + k);
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("No pairs found that add up to " + k);
        }
    }
}

