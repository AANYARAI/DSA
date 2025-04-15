public class PalindromeChecker {
    public static boolean isPalindrome(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (arr[left] != arr[right]) {
                return false;  // Not a palindrome
            }
            left++;
            right--;
        }

        return true;  // All matched
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1};

        if (isPalindrome(arr)) {
            System.out.println("Output: True");
        } else {
            System.out.println("Output: False");
        }
    }
}
