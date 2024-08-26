import java.io.*;
import java.util.*;

public class Main {

    static int n, m;
    static ArrayList<Node>[] list;
    static boolean[] visited;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        list = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            list[s].add(new Node(e, cost));
            list[e].add(new Node(s, cost));
        }

        visited = new boolean[n + 1];
        System.out.println(prim());
    }

    public static int prim() {
        // 가장 유지비가 싼것부터 연결, 모두 연결되면 종료
        PriorityQueue<Node> q = new PriorityQueue<>();
        q.offer(new Node(1, 0));
        int dist = 0; // 현재까지의 최소 경로의 간선 합을 저장한다.

        // 길 중 가장 큰 값을 마을을 분리할때 사용,
        ArrayList<Integer> checkedEdge = new ArrayList<>();

        while (!q.isEmpty()) {
            Node current = q.poll();

            if (!visited[current.idx]) {
                visited[current.idx] = true;
                checkedEdge.add(current.cost);
                dist += current.cost;

                for (Node next : list[current.idx]) {
                    if (!visited[next.idx]) {
                        q.offer(new Node(next.idx, next.cost));
                    }
                }
            }
        }
        // 가장 최대값을 찾아 합에서 제외하면 답.
        int max = checkedEdge.stream().max(Integer::compare).orElse(0);
        return dist - max;
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
