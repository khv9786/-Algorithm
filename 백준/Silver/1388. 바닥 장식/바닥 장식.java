import java.util.*;

public class Main { // 1388번 백준 바닥장식 S4
	// dfs를 통해 방문하지 않은 곳을 dfs함수 적용.
	// -에서 다음 행이 -라면 재귀로 진행.
	// | 이후 같은 열이 | 라면 재귀로 진행.
	public static char[][] room;
	public static boolean[][] visited;
	public static int answer, N, M;

	public static void main(String[] args)  {
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
				// 방문하지 않았다면
				if (!visited[i][j]) {
					// - 인경우 
					if (room[i][j] == '-') {
						dfs_row(i, j);
					}
					// | 인 경우
					if (room[i][j] == '|') {
						dfs_column(i, j);
					}
					// dfs에 한번 넣으면 무조건 조각 하나이므로 ++
					answer += 1;
				}
			}
		}
		System.out.println(answer);

	}

	public static void dfs_row(int r, int c) {
		// 만약 | 라면 연결이 끊겼으므로 종료.
		if (room[r][c] == '|') {
			return;
		}
		// 방문했으므로 체크.
		visited[r][c] = true;
		// 범위가 넘어가지 않는다면 다음으로 진행.
		if (c + 1 < M) {
			dfs_row(r, c + 1);
		}
	}

	public static void dfs_column(int r, int c) {
		// 만약 - 라면 연결이 끊겼으므로 종료
		if (room[r][c] == '-') {
			return;
		}
		// 방문했으므로 체크.
		visited[r][c] = true;
		// 범위가 넘어가지 않는다면 다음으로 진행.
		if (r + 1 < N) {
			dfs_column(r + 1, c);
		}
	}
}