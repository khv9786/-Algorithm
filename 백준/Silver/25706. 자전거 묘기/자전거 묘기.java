import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N + 1];
        int[] dp = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            arr[i] = sc.nextInt();
        }
        dp[N] = 1;
        for (int i = N - 1; i > 0; i--) {
            if (arr[i] != 0) {
                int temp = i + arr[i] + 1;
                dp[i] = (temp > N) ? 1 : dp[temp] + 1;
            } else {
                dp[i] = dp[i + 1] + 1;
            }
        }

        for (int i = 1; i <= N; i++) {
            System.out.print((i == N) ? dp[i] : dp[i] + " ");
        }
    }
}
