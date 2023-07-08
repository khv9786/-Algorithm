import java.util.Scanner;

class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
        double answer = 0;
        for (int test_case = 1; test_case <= T; test_case++) {
            double sum = 0;
            for (int i = 0; i < 10; i++) {
                int num = sc.nextInt();
                sum += num;
            }
            double average = sum / 10;
            answer = Math.round(average);
            System.out.printf("#%d %.0f\n", test_case, answer);
        }
        sc.close();
    }
}
