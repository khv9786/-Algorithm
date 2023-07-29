import java.util.*;

class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        for (int tc = 1; tc <= 10; tc++) {
            int T = sc.nextInt();
            int[] arr = new int[T];

            for (int i = 0; i < T; i++) {
                arr[i] = sc.nextInt();
            }

            int answer = 0;
            for (int i = 2; i < T - 2; i++) {
                if (arr[i] > arr[i - 2] && arr[i] > arr[i - 1] && arr[i] > arr[i + 2] && arr[i] > arr[i + 1]) {
                    int maxNeighbor = Math.max(Math.max(arr[i - 2], arr[i - 1]), Math.max(arr[i + 1], arr[i + 2]));
                    answer += arr[i] - maxNeighbor;
                    i +=2;
                }
            }
            System.out.printf("#%d %d\n", tc, answer);
        }
    }
}
