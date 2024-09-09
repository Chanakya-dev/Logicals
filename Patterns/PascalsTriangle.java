public class PascalsTriangle {
    public static void main(String[] args) {
        int n = 5; // Number of rows
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" "); // Print spaces
            }
            int number = 1; // Start number
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " "); // Print numbers
                number = number * (i - j) / (j + 1); // Calculate the next number
            }
            System.out.println();
        }
    }
}