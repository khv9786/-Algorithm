import java.io.*;
import java.util.*;

public class Main { // S3 주유소

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] distance = new int[N - 1];
        int[] cost = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int j = 0; j < N - 1; j++) {
            distance[j] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            cost[i] = Integer.parseInt(st.nextToken());
        }

        long answer = 0;
        long minCost = cost[0];

        for (int i = 0; i < N - 1; i++) {
            if (cost[i] < minCost) {
                minCost = cost[i];
            }
            answer += minCost * distance[i];
        }

        System.out.println(answer);
    }
}
