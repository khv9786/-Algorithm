import java.util.*;
import java.io.*;

public class Main {// Boj_15651_N과 M (3)
	static int N, M;
	static int [] arr;
	static StringBuilder sb;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		sb = new StringBuilder();
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int [M];
		dfs(0);
		
		System.out.println(sb);

	}
	public static void dfs(int depth) {
		 
		if (depth == M) {
			for (int i = 0; i < M; i++) {
				sb.append(arr[i]).append(" ");
			}
			sb.append('\n');
			return;
		}
		
		// 1 1 1 1 -> 1 1 1 2 -> 1 1 1 3
		for (int i = 1; i <= N; i++) {
			arr[depth] = i;
			dfs(depth + 1);
		}
	}
}
