import java.io.*;
import java.util.*;

public class Main { // 서강그라운드
    public static int[] costs, node;
    public static int[][] map;
    public static int n, m, r;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken()); // 범위
        r = Integer.parseInt(st.nextToken());

        node = new int[n + 1];
        map = new int[n + 1][n + 1];


        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            node[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i <= r; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int value = Integer.parseInt(st.nextToken());
            map[start][end] = value;
            map[end][start] = value;
        }

        int maxSum = 0;
        for (int i = 1; i <= n; i++) {
            maxSum = Math.max(maxSum, search(i)); // 각 시작점에서 탐색
        }

        sb.append(maxSum);
        System.out.println(sb);
    }

    public static int search(int start) {
        costs = new int[n + 1];
        boolean[] visited = new boolean[n + 1]; 
        Arrays.fill(costs, Integer.MAX_VALUE);
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        pq.add(new int[]{start, 0});
        costs[start] = 0;

        int sum = 0;
        while (!pq.isEmpty()) {
            int[] now = pq.poll();
            int curNode = now[0];
            int curCost = now[1];

            if (visited[curNode]) continue; 
            visited[curNode] = true; 

            if (curCost > m) {
                continue; 
            }

            sum += node[curNode];
            for (int i = 1; i <= n; i++) {
                if (map[curNode][i] != 0 && !visited[i]) {
                    int nextCost = curCost + map[curNode][i];
                    if (nextCost < costs[i]) {
                        costs[i] = nextCost;
                        pq.add(new int[]{i, nextCost});
                    }
                }
            }
        }
        return sum;
    }
}
