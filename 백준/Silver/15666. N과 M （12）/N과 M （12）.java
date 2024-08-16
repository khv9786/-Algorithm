import java.io.*;
import java.util.*;

public class Main { // N과 M (12)
    public static int N, M;
    public static int[] arr;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        arr = Arrays.stream(arr).distinct().toArray();
        Arrays.sort(arr);
        N = arr.length; // 중복 제거 후 크기 조정

        dfs(0, 0, new int[M]);

        System.out.println(sb);
    }

    public static void dfs(int depth, int start, int[] answer) {
        if (depth == M) {
            for (int s : answer) {
                sb.append(s).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = start; i < N; i++) {
            answer[depth] = arr[i];
            dfs(depth + 1, i, answer); 
        }
    }
}
