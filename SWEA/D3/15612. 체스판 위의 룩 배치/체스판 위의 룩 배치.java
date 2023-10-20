import java.util.*;

class Solution { // swea 15612. 체스판 위의 룩 배치 D3
	// - 정확히 8개의 룩이 있어야 한다. 조건이 있었네.. 2시간 걸렸다.

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			char[][] chess = new char[8][8];
			boolean[][] rook = new boolean[8][8];
			boolean answer = true;
			int cnt = 0;

			// input
			for (int y = 0; y < 8; y++) {
				String s = sc.next();
				for (int x = 0; x < 8; x++) {
					chess[y][x] = s.charAt(x);

				}
			}
			// logic
			for (int y = 0; y < 8; y++) {
				for (int x = 0; x < 8; x++) {
					if (chess[y][x] == 'O') {
						cnt++;
						if (!isSafe(y, x, rook)) {
							answer = false;
							break;
						}
					}
				}
				if (!answer) {
					break;
				}
			}
			String ans = "no";
			if (cnt == 8) {
				ans = answer ? "yes" : "no";
			}

			System.out.printf("#%d %s\n", tc, ans);
		}
	}

	public static boolean isSafe(int y, int x, boolean[][] rook) {
		for (int i = 0; i < 8; i++) {
			if (rook[i][x] || rook[y][i]) {
				return false;
			}
		}
		rook[y][x] = true;
		return true;
	}
}
