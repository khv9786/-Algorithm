import java.util.*;

class Solution { // swea 14415 격자판 칠하기
	public static char[][] arr;
	public static int case1 = 0, case2 = 0; // case1 짝수 # case2 홀수 #
	public static int white_cnt = 0, black_cnt = 0;

	public static void main(String args[]) throws Exception {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			case1 = 0; 
			case2 = 0;
			black_cnt = 0;
			white_cnt = 0;
			sc.nextLine();
			arr = new char[N][M];
			// input
			for (int j = 0; j < N; j++) {
				String s = sc.nextLine();
				for (int k = 0; k < M; k++) {
					arr[j][k] = s.charAt(k);
				}
			}
			for (int j = 0; j < N; j++) {
				for (int k = 0; k < M; k++) {
					caseCheck(j, k);
				}
			}

			String ans = "impossible";
			if (possibleChk()) {
				ans = "possible";
			}
			System.out.printf("#%d %s\n", tc, ans);
		}

	}

	public static boolean possibleChk() {
		if (case1 == black_cnt + white_cnt || case2 == black_cnt + white_cnt) {
			return true;
		}
		return false;
	}

	public static void caseCheck(int x, int y) {
		char color = arr[x][y];
		if (color == '#') {
			black_cnt += 1;
			if ((x + y) % 2 == 0) {
				case1 += 1;
			}
			if ((x + y) % 2 != 0) {
				case2 += 1;
			}
		}
		if (color == '.') {
			white_cnt += 1;
			if ((x + y) % 2 == 0) {
				case2 += 1;
			}
			if ((x + y) % 2 != 0) {
				case1 += 1;
			}
		}
	}
}
