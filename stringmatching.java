package stringmatching;

import java.util.Scanner;

public class StringMatching {

    public static void main(String[] args) {

        Scanner input1 = new Scanner(System.in);
        System.out.print("Enter Text: ");
        String T = input1.nextLine();

        System.out.print("Enter Pattern: ");
        String P = input1.nextLine();

        System.out.println("\nThe pattern: " + P);
        System.out.println("The first match at index: " + stringMatching(T, P));
    }

    // Brute Force String Matching Algorithm
    public static int stringMatching(String T, String P) {
        int n = T.length();
        int m = P.length();

        for (int i = 0; i <= n - m; i++) {
            int j = 0;

            while (j < m && P.charAt(j) == T.charAt(i + j)) {
                j++;
            }

            if (j == m)
                return i; // Pattern found
        }

        return -1; // Pattern not found
    }
}
