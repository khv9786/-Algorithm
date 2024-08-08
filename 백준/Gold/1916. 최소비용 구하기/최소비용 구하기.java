import java.io.*;
import java.util.*;

public class Main { // G5 최소비용 구하기

    static ArrayList<ArrayList<Node>> bus;
    public static int N, M, start;
    public static int[] distances;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        bus = new ArrayList<>();
        distances = new int[N + 1];
        for (int i = 0; i < N + 1; i++) {
            distances[i] = Integer.MAX_VALUE;
        }

        for (int i = 0; i < N + 1; i++) {
            bus.add(new ArrayList<Node>());
        }

        StringTokenizer st;
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int distance = Integer.parseInt(st.nextToken());
            bus.get(start).add(new Node(end, distance));
        }
        st = new StringTokenizer(br.readLine());
        start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());

        int answer = logic(start, end);
        System.out.println(answer);
    }

    public static int logic(int start, int end) {
        PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingInt(o -> o.cost));
        pq.add(new Node(start, 0));
        distances[start] = 0;
        while (!pq.isEmpty()) {
            Node curNode = pq.poll();
            if (distances[curNode.idx] < curNode.cost) {
                continue;
            }

            for (int i = 0; i < bus.get(curNode.idx).size(); i++) {
                Node nextNode = bus.get(curNode.idx).get(i);
                if (distances[nextNode.idx] > curNode.cost + nextNode.cost) {
                    distances[nextNode.idx] = curNode.cost + nextNode.cost;
                    pq.add(new Node(nextNode.idx, distances[nextNode.idx]));
                }
            }
        }
        return distances[end];
    }

    public static class Node {
        int idx, cost;

        Node(int idx, int cost) {
            this.idx = idx;
            this.cost = cost;
        }
    }
}