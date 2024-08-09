import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main { // G3 택배

        static ArrayList<ArrayList<Node>> CJ;
        public static int N, M;
        public static int[][] answer;
        public static int[] distances;
        public static int[] prev;

        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder();
            StringTokenizer st = new StringTokenizer(br.readLine());

            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());

            CJ = new ArrayList<>();
            answer = new int[N + 1][N + 1];
            distances = new int[N + 1];
            prev = new int[N + 1];

            for (int i = 0; i <= N; i++) {
                CJ.add(new ArrayList<>());
            }

            for (int i = 0; i < M; i++) {
                st = new StringTokenizer(br.readLine());
                int start = Integer.parseInt(st.nextToken());
                int end = Integer.parseInt(st.nextToken());
                int distance = Integer.parseInt(st.nextToken());
                CJ.get(start).add(new Node(end, distance));
                CJ.get(end).add(new Node(start, distance));
            }

            // 최단 경로 찾기
            for (int i = 1; i <= N; i++) {
                dijkstra(i);
            }

            // 경로 출력
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= N; j++) {
                    if (i == j) {
                        sb.append("- ");
                    } else {
                        sb.append(answer[i][j]).append(" ");
                    }
                }
                sb.append("\n");
            }

            System.out.print(sb);
        }

        static void dijkstra(int start) {
            boolean[] visited = new boolean[N + 1];
            Arrays.fill(distances, Integer.MAX_VALUE);
            Arrays.fill(prev, -1);

            PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingInt(o -> o.cost));
            pq.add(new Node(start, 0));
            distances[start] = 0;

            while (!pq.isEmpty()) {
                Node curNode = pq.poll();
                int curIdx = curNode.idx;
                if (visited[curIdx]) {
                    continue;
                }
                visited[curIdx] = true;

                for (Node nextNode : CJ.get(curIdx)) {
                    int nextIdx = nextNode.idx;
                    int newCost = distances[curIdx] + nextNode.cost;
                    if (newCost < distances[nextIdx]) {
                        distances[nextIdx] = newCost;
                        answer[nextIdx][start] = curIdx;
                        pq.add(new Node(nextIdx, distances[nextIdx]));
                    }
                }
            }
        }

        public static class Node {
            int idx, cost;

            Node(int idx, int cost) {
                this.idx = idx;
                this.cost = cost;
            }
        }
    }