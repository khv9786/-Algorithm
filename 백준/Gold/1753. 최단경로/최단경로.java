import java.io.*;
import java.util.*;

public class Main { // 최단경로
    public static int V, E, K;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        V = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());

        K = Integer.parseInt(br.readLine());

        List<List<Node>> graph = new ArrayList<>();
        for (int i = 0; i <= V; i++) {
            graph.add(new ArrayList<>());
        }

        int[] cost = new int[V + 1];
        Arrays.fill(cost, Integer.MAX_VALUE);
        cost[K] = 0;

        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            graph.get(u).add(new Node(v, w));
        }

        dijkstra(K, graph, cost);

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= V; i++) {
            if (cost[i] == Integer.MAX_VALUE) {
                sb.append("INF\n");
            } else {
                sb.append(cost[i]).append("\n");
            }
        }

        System.out.println(sb.toString());
    }

    public static void dijkstra(int start, List<List<Node>> graph, int[] cost) {
        PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingInt(node -> node.cost));
        pq.add(new Node(start, 0));

        while (!pq.isEmpty()) {
            Node cr = pq.poll();
            int crNode = cr.idx;
            int crCost = cr.cost;

            if (crCost > cost[crNode]) continue;

            for (Node n : graph.get(crNode)) {
                int newCost = crCost + n.cost;
                if (newCost < cost[n.idx]) {
                    cost[n.idx] = newCost;
                    pq.add(new Node(n.idx, newCost));
                }
            }
        }
    }

    static class Node {
        int idx;
        int cost;

        Node(int idx, int cost) {
            this.idx = idx;
            this.cost = cost;
        }
    }
}
