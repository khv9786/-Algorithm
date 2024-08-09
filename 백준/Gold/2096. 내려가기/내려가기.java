import java.io.*;
import java.util.*;

public class Main { // G5 최소비용 구하기

    public static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());

        StringTokenizer st;
        int[][] map = new int[N][3];
        int[][] minDp = new int[N][3];
        int[][] maxDp = new int[N][3];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        minDp[0][0] = map[0][0];
        minDp[0][1] = map[0][1];
        minDp[0][2] = map[0][2];
        maxDp[0][0] = map[0][0];
        maxDp[0][1] = map[0][1];
        maxDp[0][2] = map[0][2];

        for (int i = 1; i < N; i++) {
            maxDp[i][0] = Math.max(maxDp[i - 1][0], maxDp[i - 1][1]) + map[i][0];
            maxDp[i][1] = Math.max(Math.max(maxDp[i - 1][1], maxDp[i - 1][2]), maxDp[i - 1][0]) + map[i][1];
            maxDp[i][2] = Math.max(maxDp[i - 1][2], maxDp[i - 1][1]) + map[i][2];
        }
        sb.append(Math.max(maxDp[N-1][2], Math.max(maxDp[N-1][0], maxDp[N-1][1]))).append(" ");

        for (int i = 1; i < N; i++) {
            minDp[i][0] = Math.min(minDp[i - 1][0], minDp[i - 1][1]) + map[i][0];
            minDp[i][1] = Math.min(Math.min(minDp[i - 1][1], minDp[i - 1][2]), minDp[i - 1][0]) + map[i][1];
            minDp[i][2] = Math.min(minDp[i - 1][2], minDp[i - 1][1]) + map[i][2];
        }
        sb.append(Math.min(minDp[N-1][2], Math.min(minDp[N-1][0], minDp[N-1][1])));
        System.out.println(sb);
    }
}
