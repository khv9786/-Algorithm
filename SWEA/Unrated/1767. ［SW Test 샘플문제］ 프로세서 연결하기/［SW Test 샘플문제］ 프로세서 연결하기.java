import java.util.*;

class Solution {// 1767. [SW Test 샘플문제] 프로세서 연결하기
	public static int answer;
	public static int n, core, line;
	public static int[][] map;
	public static int[] dx = { 0, 0, -1, 1 }; // 상하좌우
	public static int[] dy = { 1, -1, 0, 0 };
	public static List<int[]> list = new ArrayList<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			n = sc.nextInt();
			answer = Integer.MAX_VALUE;
			core = 0;
			line = n * n;
			map = new int[n][n];
			list.clear();
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					map[i][j] = sc.nextInt();
					if (map[i][j] == 1) {
						if (i != 0 && j != 0 && i != n - 1 && j != n - 1) {
							list.add(new int[] { i, j });
						}
					}
				}
			}
			dfs(0, 0, 0);
			System.out.printf("#%d %d\n", tc, answer);
		}
	}

	public static void dfs(int chk, int length, int connectCore) {
		if (chk == list.size()) {
			if (core < connectCore) {
				core = connectCore;
				answer = length;
			} else if (core == connectCore) {
				answer = Math.min(answer, length);
			}
			return;
		}
		int x = list.get(chk)[0];
		int y = list.get(chk)[1];
		for (int i = 0; i < 4; i++) {
			if (rangeChk(x, y, i)) {
				dfs(chk + 1, length + connect(x, y, i), connectCore + 1);
				disconnect(x, y, i);
			}
		}
		dfs(chk + 1, length, connectCore);

	}

	// 좌표, 방향으로 범위 확인
	public static boolean rangeChk(int x, int y, int d) {
		x += dx[d];
		y += dy[d];
		while (x >= 0 && y >= 0 && x < n && y < n) {		
			if (map[x][y] != 0) {
				return false;
			}
			x += dx[d];
			y += dy[d];
		}
		return true;
	}

	public static int connect(int x, int y, int d) {
		line = 0;
		x += dx[d];
		y += dy[d];
		while (x >= 0 && y >= 0 && x < n && y < n) {
			map[x][y] = 2;
			line++;
			x += dx[d];
			y += dy[d];
		}
		return line;
	}

	public static void disconnect(int x, int y, int d) {
		x += dx[d];
		y += dy[d];
		while (x >= 0 && y >= 0 && x < n && y < n) {
			map[x][y] = 0;
			x += dx[d];
			y += dy[d];
		}
	}
}
