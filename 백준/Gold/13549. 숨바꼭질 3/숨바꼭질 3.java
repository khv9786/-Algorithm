import java.io.*;
import java.util.*;

public class Main {

    public static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        if (N == M) {
            System.out.println(0);
            return;
        }

        int[] dist = new int[Math.max(N, M) * 2 + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[N] = 0;

        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(N);

        while (!queue.isEmpty()) {
            int now = queue.poll();

            if (now == M) {
                break;
            }

            if (now * 2 < dist.length && dist[now * 2] > dist[now]) {
                dist[now * 2] = dist[now];
                queue.add(now * 2);
            }

            if (now - 1 >= 0 && dist[now - 1] > dist[now] + 1) {
                dist[now - 1] = dist[now] + 1;
                queue.add(now - 1);
            }

            if (now + 1 < dist.length && dist[now + 1] > dist[now] + 1) {
                dist[now + 1] = dist[now] + 1;
                queue.add(now + 1);
            }
        }

        System.out.println(dist[M]);
    }
}
