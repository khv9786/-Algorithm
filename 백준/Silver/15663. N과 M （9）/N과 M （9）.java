import java.io.*;
import java.util.*;

public class Main { // N과 M (9)
    public static int N, M;
    public static StringBuilder sb;
    public static boolean[] visit;
    public static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N];
        visit = new boolean[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        dfs(0, new int[M]);

        System.out.println(sb);
    }

    public static void dfs(int depth, int[] nums ) {
        if (depth == M) {
            for (int s : nums) {
                sb.append(s).append(" ");
            }
            sb.append("\n");
            return;
        }

        int prev = -1;
        for (int i = 0; i < N; i++) {
            if (!visit[i] && arr[i] != prev) {
                visit[i] = true;
                nums[depth] = arr[i];
                prev = arr[i];  // 현재 값을 이전 값으로 업데이트
                dfs(depth + 1, nums);
                visit[i] = false;
            }
        }
    }
}
