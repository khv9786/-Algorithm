import java.io.*;
import java.util.*;

public class Main { // RGB거리
    public static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        int [][] arr = new int[N][3];
        int [][] dp = new int[N][3];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < 3 ; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i = 0; i < 3; i++) {
            dp[0][i] = arr[0][i];
        }
        for(int i = 1; i < N; i++) {
            dp[i][0] = (Math.min(dp[i-1][1], dp[i-1][2])) + arr[i][0];
            dp[i][1] = (Math.min(dp[i-1][0], dp[i-1][2])) + arr[i][1];
            dp[i][2] = (Math.min(dp[i-1][1], dp[i-1][0])) + arr[i][2];
        }

        int answer = Math.min(dp[N-1][0], Math.min(dp[N-1][1], dp[N-1][2]));

        System.out.println(answer);
    }
}
