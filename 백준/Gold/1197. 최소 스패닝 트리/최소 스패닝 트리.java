import java.io.*;
import java.util.*;

public class Main { // 최소 스패닝 트리

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int V = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());

        // 간선이 아닌 정점의 개수로 변경..
        ArrayList<Node>[] tree = new ArrayList[V + 1];
        boolean[] visited = new boolean[V + 1];

        for (int i = 1; i <= V; i++) {
            tree[i] = new ArrayList<>();
        }
        
        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            tree[s].add(new Node(e, c));
            tree[e].add(new Node(s, c));

        }

        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.add(new Node(1, 0));

        long answer = 0L;

        while (!pq.isEmpty()) {
            Node node = pq.poll();
            if (visited[node.idx]) {
                continue;
            }
            answer += node.cost;
            visited[node.idx] = true;

            for (Node next : tree[node.idx]) {
                if (!visited[next.idx]) {
                    pq.add(new Node(next.idx, next.cost));
                }
            }

        }
        System.out.println(answer);

    }

    public static class Node implements Comparable<Node> {
        int idx;
        int cost;

        public Node(int idx, int cost) {
            this.idx = idx;
            this.cost = cost;
        }

        @Override
        public int compareTo(Node n1) {
            return Integer.compare(this.cost, n1.cost);
        }
    }
}
