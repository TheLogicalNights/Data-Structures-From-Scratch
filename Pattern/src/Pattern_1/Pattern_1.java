package Pattern_1;

/**
 * Pattern 1: * * * * *
 *            * * * * *
 *            * * * * *
 *            * * * * *
 *            * * * * *
 * n = 5
 */
public class Pattern_1 {
    public void displayPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
              System.out.print("* ");
            }
            System.out.println();
        }
    }
}
