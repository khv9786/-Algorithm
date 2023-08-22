import java.util.*;

class Solution {

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);

        int totalTestCases = sc.nextInt();
        sc.nextLine(); 
        for (int tc = 1; tc <= totalTestCases; tc++) {
            sc.next(); 
            int length = sc.nextInt();

            int[] num = new int[10];
            String[] planet = {"ZRO", "ONE", "TWO", "THR", "FOR", "FIV", "SIX", "SVN", "EGT", "NIN"};

            for (int i = 0; i < length; i++) {
                String a = sc.next();
                for (int k = 0; k < 10; k++) {
                    if (a.equals(planet[k])) {
                        num[k]++;
                        break;
                    }
                }
            }

            // Output
            System.out.printf("#%d\n", tc);
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < num[j]; k++) {
                    System.out.printf(planet[j] + " ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
