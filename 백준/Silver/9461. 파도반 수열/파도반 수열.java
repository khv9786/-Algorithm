import java.io.*;
import java.util.*;

public class Main {// S3 파도반 수열
    public static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(st.nextToken());

        long[] arr = new long[N];
        for (int k = 0; k < N; k++) {
            arr[k] = Integer.parseInt(br.readLine());
        }

        long[] dp = new long[101];
        // 1 1 1 2 2 3 4 5 7 9 12 16 21 28 37 48 ...
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 1;
        dp[4] = 2;
        dp[5] = 2;
        dp[6] = 3;
        // 1,3 / 4 / 5,1 / 6,2 / 7,3 / 8,4/ 9,5/
        // 10, 6 짝궁 / 11이랑 7이랑 짝궁 / 12이랑 8이랑 짝궁 /

        for (int i = 7; i <= 100; i++) {
            dp[i] = dp[i - 1] + dp[i - 5];
        }

        for (long i : arr) {
            sb.append(dp[(int)i]).append("\n");
        }

        System.out.println(sb);
    }
}
