import java.util.*;

class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            
            float answer;
            
            if (y - x == z - y) {
                answer = 0;
            } else {
                answer = (float) (Math.abs((y - x) - (z - y)) / 2.0); 
            }

            System.out.printf("#%d %.1f%n", test_case, answer);
        }
    }
}
