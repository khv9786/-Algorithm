import java.io.*;
import java.util.*;

public class Main { // 가장 긴 증가하는 부분 수열
    public static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        int answer = 0;

        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] dp = new int[N];
        Arrays.fill(dp, 1);

        // i는 시작 점
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if( arr[j] > arr[i] ) {
                    dp[j] = Math.max(dp[j], dp[i] + 1);
                }
            }
        }

        answer = Arrays.stream(dp).max().orElse(1);

        System.out.println(answer);
    }
}