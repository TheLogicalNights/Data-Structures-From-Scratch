package Pattern_2;

/**
 * Pattern 2: *
 *            * *
 *            * * *
 *            * * * *
 *            * * * * *
 *  n = 5
 */
public class Pattern_2 {
    public void displayPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
