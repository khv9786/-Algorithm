import java.util.*;

public class Main { // 7569번 토마토 G5 41%
	// bfs로 해결.
	// 하루마다 1인접 0은 모두 +1 날짜는 익은 토마토에 +1 계속하기.
	// 인접해 있는지 체크 필요.
	public static int[] dx = { 0, 0, -1, 1, 0, 0 };
	public static int[] dy = { 1, -1, 0, 0, 0, 0 };
	public static int[] dz = { 0, 0, 0, 0, 1, -1 };
	public static int H, N, M, answer; // z,x,y
	public static int[][][] tomato;
	public static Queue<int[]> que = new LinkedList<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		M = sc.nextInt();
		N = sc.nextInt();
		H = sc.nextInt();
		tomato = new int[H][N][M];
		// input -> 익은 토마토 1, 안익은 토마토 0. 공백 -1
		for (int h = 0; h < H; h++) {
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					tomato[h][i][j] = sc.nextInt();
					if (tomato[h][i][j] == 1) {
						que.add(new int[] { h, i, j });
					}
				}
			}
		}
		bfs();

		System.out.println(answer);

	}

	public static void bfs() {
		while (!que.isEmpty()) {
			int[] cur = que.poll();
			int cur_Z = cur[0];
			int cur_X = cur[1];
			int cur_Y = cur[2];
			for (int i = 0; i < 6; i++) {
				int next_Z = cur_Z + dz[i];
				int next_X = cur_X + dx[i];
				int next_Y = cur_Y + dy[i];
				if (chk(next_Z, next_X, next_Y)) {
					que.add(new int[] { next_Z, next_X, next_Y });
					tomato[next_Z][next_X][next_Y] = tomato[cur_Z][cur_X][cur_Y] + 1;
				}
			}
		}
		int result = Integer.MIN_VALUE;

		for (int i = 0; i < H; i++) {
			for (int j = 0; j < N; j++) {
				for (int k = 0; k < M; k++) {
					if (tomato[i][j][k] == 0) {
						answer = -1;
						return;
					}
					result = Math.max(result, tomato[i][j][k]);
				}
			}
		}
		if (result == 1) {
			answer = 0;
			return;
		} else {
			answer = result - 1;
			return;
		}
	}

	public static boolean chk(int z, int x, int y) {
		return z >= 0 && x >= 0 && y >= 0 && z < H && x < N && y < M && (tomato[z][x][y] == 0);
	}
}
