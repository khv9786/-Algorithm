import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int arr[] = new int[N + 1];
        int[] dp = new int[N + 1];
        dp[N] = 1;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = N - 1; i > 0; i--) {
            if (arr[i] != 0) {
                int temp = i + arr[i] + 1;
                dp[i] = (temp > N) ? 1 : dp[temp] + 1;
            } else {
                dp[i] = dp[i + 1] + 1;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            sb.append((i == N) ? dp[i] : dp[i] + " ");
        }

        System.out.println(sb.toString());
    }
}
