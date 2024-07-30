import java.io.*;
import java.util.*;

public class Main { // S3 2xn 타일링
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int[] dp = new int[Math.max(N + 1, 2)];

        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= N; i++) {
            // 아오 괄호 ㅋ ㅋ ㅋ ㅋㅋㅋㅋㅋㅋㅋ
            dp[i] = (dp[i - 1] + dp[i - 2]) % 10007;
        }

        System.out.println(dp[N]);
    }
}