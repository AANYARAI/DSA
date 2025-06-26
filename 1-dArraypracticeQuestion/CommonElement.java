public class CommonElement {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 3};
        boolean found = false;

        for (int i : arr1) {
            for (int j : arr2) {
                if (i == j) {
                    found = true;
                    System.out.println("Common element found: " + i);
                    break;
                }
            }
            if (found) break;
        }

        if (!found) {
            System.out.println("No common elements found.");
        }
    }
}
