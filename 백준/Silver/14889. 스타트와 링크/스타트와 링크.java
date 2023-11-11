import java.util.*;

public class Main { // 14889번 스타트와 링크
	public static int[][] arr;
	public static boolean[] used;
	public static int N, answer;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		arr = new int[N][N];
		used = new boolean[N];
		answer = Integer.MAX_VALUE;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (j > i) {
					arr[i][j] += arr[j][i];
					arr[j][i] = 0;
				}
			}
		}
		dfs(0, 0);

		System.out.println(answer);
	}

	public static void dfs(int team, int idx) {
		if (team == N / 2) {
			int Min = 0;

			for (int i = 0; i < N - 1; i++) {
				for (int j = i + 1; j < N; j++) {
					if (used[i] && used[j]) {
						Min += arr[i][j];
					}
					if (!used[i] && !used[j]) {
						Min -= arr[i][j];
					}
				}
			}
			answer = Math.min(answer, Math.abs(Min));
			return;
		}

		for (int i = idx; i < N; i++) {
			used[i] = true;
			dfs(team + 1, i + 1);
			used[i] = false;
		}
	}
}