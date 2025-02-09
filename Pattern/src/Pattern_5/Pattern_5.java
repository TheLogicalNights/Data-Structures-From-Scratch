package Pattern_5;

/**
 *   Pattern 5: * * * * *
 *              * * * *
 *              * * *
 *              * *
 *              *
 * n = 5
 */
public class Pattern_5 {
    public void displayPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
