import java.io.*;
import java.util.*;

class Solution { // swea 5215. 햄버거 다이어트 D3
	// 칼로리 범위 내에서 모든 재료 넣어서 최대값 구하기.
	public static int[][] ingredient;
	public static int answer, N, L;

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			N = sc.nextInt(); // 재료 수
			L = sc.nextInt(); // 칼로리 제한
			answer = 0;
			ingredient = new int[N + 1][2];
			for (int i = 0; i < N; i++) {
				ingredient[i][0] = sc.nextInt(); // 맛 점수
				ingredient[i][1] = sc.nextInt(); // 칼로리
			}
			dfs(0, 0, 0);
			System.out.println("#" + tc + " " + answer);
		}
	}

	public static void dfs(int depth, int cal, int point) {
		if (cal > L) {
			return;
		}
		// 모든경우 다 찾았으므로
		if (depth == N) {
			answer = Math.max(answer, point);
			return;
		}
		
		dfs(depth + 1, cal + ingredient[depth][1], point + ingredient[depth][0]);
		dfs(depth + 1, cal, point);
	}
}
