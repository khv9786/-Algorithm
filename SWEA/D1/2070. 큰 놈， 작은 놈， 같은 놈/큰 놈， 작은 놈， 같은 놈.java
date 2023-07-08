import java.util.Scanner;

class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            String comparisonSymbol;
            if (A > B)
                comparisonSymbol = ">";
            else if (A == B)
                comparisonSymbol = "=";
            else
                comparisonSymbol = "<";

            System.out.printf("#%d %s\n", test_case, comparisonSymbol);
        }

        sc.close();
    }
}
