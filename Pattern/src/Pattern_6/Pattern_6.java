package Pattern_6;

/**
 *   Pattern 5: 1 2 3 4 5
 *              1 2 3 4
 *              1 2 3
 *              1 2
 *              1
 * n = 5
 */
public class Pattern_6 {
    public void displayPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
