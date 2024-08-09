import java.io.*;
import java.util.*;

public class Main { // G4 저울

    public static int N, M;
    public static ArrayList<ArrayList<Integer>> larger;
    public static ArrayList<ArrayList<Integer>> smaller;
    public static int[] answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        larger = new ArrayList<>();
        smaller = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            larger.add(new ArrayList<>());
            smaller.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            larger.get(a).add(b);
            smaller.get(b).add(a);
        }

        answer = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            boolean[] visitedLarger = new boolean[N + 1];
            boolean[] visitedSmaller = new boolean[N + 1];

            dfsFindLarger(i, visitedLarger);
            dfsFindSmaller(i, visitedSmaller);

            int count = 0;
            for (int j = 1; j <= N; j++) {
                if (i != j && !visitedLarger[j] && !visitedSmaller[j]) {
                    count++;
                }
            }
            answer[i] = count;
        }

        for (int i = 1; i <= N; i++) {
            sb.append(answer[i]).append("\n");
        }
        System.out.print(sb);
    }

    public static void dfsFindLarger(int now, boolean[] visited) {
        visited[now] = true;
        for (int next : larger.get(now)) {
            if (!visited[next]) {
                dfsFindLarger(next, visited);
            }
        }
    }

    public static void dfsFindSmaller(int now, boolean[] visited) {
        visited[now] = true;
        for (int next : smaller.get(now)) {
            if (!visited[next]) {
                dfsFindSmaller(next, visited);
            }
        }
    }
}
