import java.util.*;
import java.io.*;

public class Main {// 15649번 N과 M(1)
	// 백트래킹
	static int N, M;
	static boolean[] visit;
	static int[] arr;
	static StringBuilder sb;
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		visit = new boolean[N+1];
		arr = new int[M];
		sb = new StringBuilder();

		dfs(0);

		System.out.println(sb);
	}

	public static void dfs(int depth) {
		if (depth == M) {
			for(int val : arr) {
				sb.append(val + " ");
			}
			sb.append("\n");
			return;
		}

		for (int j = 1; j <= N; j++) {
			if (!visit[j]) {
				visit[j] = true;
				arr[depth] = j;
				dfs(depth+1);
				visit[j] = false;
			}
		}

	}
}
