import java.util.*;

class Solution { // 1974. 스도쿠 검증 D2
	public static int answer;
	public static int[][] map;
	public static HashSet<Integer> chk = new HashSet<>();
	public static HashSet<Integer> chk_c = new HashSet<>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		
		
		for (int tc = 1; tc <= T; tc++) {
			map = new int[9][9];
			answer = 1;
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					map[i][j] = sc.nextInt();
				}
			}
			chk();
			chk_box(0, 0);

			System.out.println("#" + tc + " " + answer);

		}
	}

	public static void chk() {
		// row
		for (int i = 0; i < 9; i++) {
			chk = new HashSet<>();
			chk_c = new HashSet<>();
			for (int j = 0; j < 9; j++) {
				chk.add(map[i][j]);
				chk_c.add(map[j][i]);
			}if (chk.size() != 9 || chk_c.size() != 9) {
				answer = 0;
				return;
			}
		}
		
	}

	public static void chk_box(int r, int c) {

		chk = new HashSet<>();
		for (int i = r; i < r + 3; i++) {
			for (int j = c; j < c + 3; j++) {
				chk.add(map[i][j]);
			}
		}
		if (chk.size() != 9) {
			answer = 0;
			return;
		} else if (c == 6 && r != 6) {
			chk_box(r + 3, 0);
		} else if(r == 6){
			chk_box(r, c + 3);
		}

		if (r == 6 && c == 6) {
			return;
		}
	}
}
