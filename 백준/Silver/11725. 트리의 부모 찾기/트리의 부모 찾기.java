import java.io.*;
import java.util.*;

public class Main { //  Boj_11725_트리의 부모 찾기
    static int N;
    static Map<Integer, List<Integer>> tree = new HashMap<>();
    static int[] parents;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        parents = new int[N + 1];

        for (int i = 0; i < N - 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            tree.computeIfAbsent(a, k -> new ArrayList<>()).add(b);
            tree.computeIfAbsent(b, k -> new ArrayList<>()).add(a);
        }

        dfs(1, 0);

        for (int i = 2; i <= N; i++) {
            System.out.println(parents[i]);
        }
    }
    public static void dfs(int current, int parent) {
        parents[current] = parent;
        for (int child : tree.getOrDefault(current, new ArrayList<>())) {
            if (child != parent) {
                dfs(child, current);
            }
        }
    }
}