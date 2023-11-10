import java.util.*;

public class Main { // 1388번 백준 바닥장식 S4
	public static char[][] room;
	public static boolean[][] visited;
	public static int answer, N, M;

	public static void main(String[] args) throws Exception {
		// input
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		sc.nextLine();
		answer = 0;
		room = new char[N][M];
		visited = new boolean[N][M];

		for (int i = 0; i < N; i++) {
			String c = sc.nextLine();
			for (int j = 0; j < M; j++) {
				room[i][j] = c.charAt(j);
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (!visited[i][j]) {
					if (room[i][j] == '-') {
						dfs_row(i, j);
					}
					if (room[i][j] == '|') {
						dfs_column(i, j);
					}
					answer++;
				}
			}
		}
		System.out.println(answer);

	}

	public static void dfs_row(int r, int c) {
		if (room[r][c] == '|') {
			return;
		}
		visited[r][c] = true;
		if (c + 1 < M) {
			dfs_row(r, c + 1);
		}
	}

	public static void dfs_column(int r, int c) {
		if (room[r][c] == '-') {
			return;
		}
		visited[r][c] = true;

		if (r + 1 < N) {
			dfs_column(r + 1, c);
		}
	}
}