import java.io.*;
import java.util.*;

public class Main { // 특정한 최단 경로
    public static int N, E;
    public static ArrayList<ArrayList<Node>> graph;
    public static int[] costs;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());

        graph = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<Node>());
        }

        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            // 양방향
            graph.get(start).add(new Node(end, cost));
            graph.get(end).add(new Node(start, cost));
        }

        st = new StringTokenizer(br.readLine());
        int route1 = Integer.parseInt(st.nextToken());
        int route2 = Integer.parseInt(st.nextToken());

        int case1 = 0, case2 = 0;

        int path1 = dij(1, route1);
        int path2 = dij(route1, route2);
        int path3 = dij(route2, N);
        
        if (NonePathChk(path1, path2, path3)) {
            case1 = Integer.MAX_VALUE;
        } else {
            case1 = path1 + path2 + path3;
        }

        path1 = dij(1, route2);
        path2 = dij(route2, route1);
        path3 = dij(route1, N);
        
        if (NonePathChk(path1, path2, path3)) {
            case2 = Integer.MAX_VALUE;
        } else {
            case2 = path1 + path2 + path3;
        }

        int answer = Math.min(case1, case2);
        
        // 없는 경로 처리
        if (answer == Integer.MAX_VALUE) {
            System.out.println("-1");
        } else {
            System.out.println(answer);
        }
    }

    public static int dij(int start, int end) {
        costs = new int[N + 1];
        Arrays.fill(costs, Integer.MAX_VALUE);
        PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingInt(o -> o.cost));
        pq.add(new Node(start, 0));
        costs[start] = 0;

        while (!pq.isEmpty()) {
            Node cur = pq.poll();
            int curV = cur.vertex;
            int curC = cur.cost;

            if (costs[curV] < curC) {
                continue;
            }

            for (Node next : graph.get(curV)) {
                int newC = curC + next.cost;
                if (newC < costs[next.vertex]) {
                    costs[next.vertex] = newC;
                    pq.add(new Node(next.vertex, newC));
                }
            }
        }
        return costs[end];
    }
    public static boolean NonePathChk(int a, int b, int c) {
        return (a == Integer.MAX_VALUE || b == Integer.MAX_VALUE || c == Integer.MAX_VALUE);
    }

    public static class Node {
        int vertex;
        int cost;

        Node(int vertex, int cost) {
            this.vertex = vertex;
            this.cost = cost;
        }
    }
}
