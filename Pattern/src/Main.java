import Pattern_1.Pattern_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the value of n");
        try (Scanner cin = new Scanner(System.in)){
            int n = cin.nextInt();
            new Pattern_1().displayPattern(n);
        } catch (Exception ex) {
            System.out.println("Exception: Something went wrong, reason: " + ex.getMessage());
        }
    }
}