import java.io.*;
import java.util.*;

public class Main { // N과 M (5)
    public static int N, M;
    public static int [] arr;
    public static StringBuilder sb = new StringBuilder();
    public static boolean[] visit;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        visit = new boolean[N];

        dfs(0, new int[M]);

        System.out.println(sb);
    }

    public static void dfs(int depth, int[] output) {
        if (depth == M) {
            for (int num : output) {
                sb.append(num).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visit[i]) {
                visit[i] = true;
                output[depth] = arr[i];
                dfs(depth + 1, output);
                visit[i] = false;
            }
        }
    }
}
