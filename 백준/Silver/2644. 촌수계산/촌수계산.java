import java.util.*;

public class Main { // 2644번 촌수계산 s2 49%
	// 특정 위치 찾는거라 dfs 사용.
	// 연관 관계를 어떻게 받을까 그래프로 해야하나 고민했네 [][] 로 해결

	public static int n, start, end, m, answer;
	public static int[][] arr;
	public static boolean[] chk;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		start = sc.nextInt();
		end = sc.nextInt();
		m = sc.nextInt();
		arr = new int[n + 1][n + 1];
		chk = new boolean[n + 1];
		answer = -1;
		for (int i = 0; i < m; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			arr[x][y] = 1;
			arr[y][x] = 1;
		}
		dfs(start, 0);
		System.out.println(answer);
	}

	public static void dfs(int idx, int depth) {
		if (idx == end) {
			answer =depth;
			return;
		}

		for (int i = 1; i <= n; i++) {
			if (arr[idx][i] == 1 && !chk[i]) {
				chk[i] = true;
				dfs(i, depth + 1);
				chk[i] = false;
			}
		}
	}
}
