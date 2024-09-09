public class HollowDiamondPattern {
    public static void main(String[] args) {
        int n = 5; // Number of rows for the upper part
        // Upper part
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" "); // Print spaces
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1)) {
                    System.out.print("* "); // Print stars for borders
                } else {
                    System.out.print("  "); // Print space for hollow part
                }
            }
            System.out.println();
        }
        // Lower part
        for (int i = n - 1; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" "); // Print spaces
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1)) {
                    System.out.print("* "); // Print stars for borders
                } else {
                    System.out.print("  "); // Print space for hollow part
                }
            }
            System.out.println();
        }
    }
}
