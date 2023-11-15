import java.io.*;
import java.util.*;

class Solution { // swea 2005. 파스칼의 삼각형

	public static boolean line[][], visit[];
	public static int N, M, answer;

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			N = sc.nextInt(); // 정점
			M = sc.nextInt(); // 간선
			answer = 1;
			line = new boolean[N + 1][N + 1];
			visit = new boolean[N + 1];
			for (int i = 0; i < M; i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				line[x][y] = true;
				line[y][x] = true;
			}
			for (int i = 1; i <= N; i++) {
				visit[i] = true;
				dfs(i, 1);
				visit[i] = false;
			}

			// output
			System.out.println("#" + tc + " " + answer);
		} // tc
	}

	public static void dfs(int start, int depth) {
		if (depth == N) {
			answer = N;
			return;
		}
		
		for (int end = 1; end <= N; end++) {
			if (line[start][end] == true && !visit[end]) {
				visit[end] = true;
				dfs(end, depth + 1);
				visit[end] = false;
			}
		}
		answer = Math.max(answer, depth);

	}
}
