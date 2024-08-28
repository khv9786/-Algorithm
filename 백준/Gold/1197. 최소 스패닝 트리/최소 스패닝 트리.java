import java.io.*;
import java.util.*;

public class Main { // 최소 스패닝 트리 - 크루스칼 알고리즘

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int V = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());

        PriorityQueue<Node> pq = new PriorityQueue<>();
        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            pq.add(new Node(s, e, c)); //
        }

        int[] parent = new int[V + 1];
        int[] rank = new int[V + 1];
        for (int i = 1; i <= V; i++) {
            parent[i] = i;
            rank[i] = 1;
        }

        long answer = 0L;
        int edgesUsed = 0;

        while (edgesUsed < V - 1 && !pq.isEmpty()) {
            Node node = pq.poll();
            if (union(parent, rank, node.start, node.end)) {
                answer += node.weight;
                edgesUsed++;
            }
        }

        System.out.println(answer);
    }

    // Find 연산 경로 압축 기법
    public static int find(int[] parent, int x) {
        if (parent[x] != x) {
            parent[x] = find(parent, parent[x]);
        }
        return parent[x];
    }

    // Union 연산 랭크를 활용하여 트리 높이를 최소화
    public static boolean union(int[] parent, int[] rank, int a, int b) {
        int rootA = find(parent, a);
        int rootB = find(parent, b);

        if (rootA == rootB) return false; // 이미 같은 집합에 속하는 경우

        // 랭크를 기준으로 낮은 트리를 높은 트리 아래에 붙임
        if (rank[rootA] > rank[rootB]) {
            parent[rootB] = rootA;
        } else if (rank[rootA] < rank[rootB]) {
            parent[rootA] = rootB;
        } else {
            parent[rootB] = rootA;
            rank[rootA]++;
        }

        return true;
    }

    public static class Node implements Comparable<Node> {
        int start;
        int end;
        int weight;

        public Node(int start, int end, int weight) {
            this.start = start;
            this.end = end;
            this.weight = weight;
        }

        @Override
        public int compareTo(Node n) {
            return Integer.compare(this.weight, n.weight); // 가중치에 따라 비교
        }
    }
}
