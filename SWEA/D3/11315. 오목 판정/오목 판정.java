import java.util.*;

public class Solution { // 6485. 삼성시의 버스 노선
	public static int[] dr = { -1, -1, -1, 0, 0, 1, 1, 1 };
	public static int[] dc = { -1, 0, 1, -1, 1, -1, 0, 1 };
	public static char[][] arr;
	public static int N;
	public static String answer;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			N = sc.nextInt();
			arr = new char[N][N];
			for (int i = 0; i < N; i++) {
				String s = sc.next();
				for (int j = 0; j < N; j++) {
					arr[i][j] = s.charAt(j);
				}
			}
			answer = "NO";

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (arr[i][j] == 'o') {
						dfs(i, j, 9, 1);
					}
				}
			}

			StringBuilder sb = new StringBuilder();

			sb.append("#" + tc);
			sb.append(" " + answer);
			System.out.println(sb);

		} // tc
	}

	public static void dfs(int r, int c, int d, int cnt) {
		if (cnt == 5) {
			answer = "YES";
			return;
		}
		if (d == 9) {
			for (int k = 0; k < 8; k++) {
				int next_r = r + dr[k];
				int next_c = c + dc[k];
				if (!rangechk(next_r,next_c))
					continue;
				if (arr[next_r][next_c] != 'o')
					continue;
				dfs(next_r, next_c, k, cnt + 1);
			}
		} else {
			int next_r = r + dr[d];
			int next_c = c + dc[d];
			if (rangechk(next_r,next_c))
				if (arr[next_r][next_c] == 'o')
					dfs(next_r, next_c, d, cnt + 1);
		}
	}

	public static boolean rangechk(int r, int c) {
		return (r >= 0 && c >= 0 && r < N && c < N);
	}

}
