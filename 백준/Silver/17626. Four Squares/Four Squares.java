import java.io.*;
import java.util.*;

public class Main { // Four Squares
    public static int N;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        int[] dp = new int[N + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for (int i = 1; i * i <= N; i++) {
            int square = (int)Math.pow(i,2);
            for (int j = square; j <= N; j++) {
                dp[j] = Math.min(dp[j], dp[j - square] + 1);
//                System.out.println("현재 :" + j+ "값 :" + dp[j]);
            }
        }

        System.out.println(dp[N]);
    }
}
