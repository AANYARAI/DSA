public class Frequency {
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 3, 3, 5 , 6 , 8 };
        int n = arr.length;
        boolean[] visited = new boolean[n];

        System.out.println("Element Frequency");

        for (int i = 0; i < n; i++) {
            if (visited[i]) continue;

            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }

            System.out.println(arr[i] + "        " + count);
        }
    }
}




