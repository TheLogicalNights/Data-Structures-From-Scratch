import Pattern_1.Pattern_1;
import Pattern_2.Pattern_2;
import Pattern_3.Pattern_3;
import Pattern_4.Pattern_4;
import Pattern_5.Pattern_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the value of n");
        try (Scanner cin = new Scanner(System.in)){
            int n = cin.nextInt();
//            new Pattern_1().displayPattern(n);
//            new Pattern_2().displayPattern(n);
//            new Pattern_3().displayPattern(n);
//            new Pattern_4().displayPattern(n);
            new Pattern_5().displayPattern(n);
        } catch (Exception ex) {
            System.out.println("Exception: Something went wrong, reason: " + ex.getMessage());
        }
    }
}