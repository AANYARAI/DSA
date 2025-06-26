public class PythagoreanTriples {
    public static void main(String[] args) {
      
        int limit = 10;
        for (int a = 1; a <=10; a++) {
            for (int b = a + 1; b <= 10; b++) {
                for (int c = b + 1; c <= 10; c++) {
                    if (a * a + b * b == c * c) {
                        System.out.println("Pythagorean Triple: a = " + a + ", b = " + b + ", c = " + c);
                    }
                }
            }
        }
    }
}
