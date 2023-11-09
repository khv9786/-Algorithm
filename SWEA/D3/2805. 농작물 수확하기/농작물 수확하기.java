import java.util.*;

class Solution { // 2805. 농작물 수확하기

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int answer = 0;
			int sum = 0;
			int n = sc.nextInt();
			int map[][] = new int[n][n];
			for (int i = 0; i < n; i++) {
				String s = sc.next();
				for (int j = 0; j < n; j++) {
					int a = (s.charAt(j)-'0');
					map[i][j] = a;
					sum += a;
				}
			}
			if (n == 1) {
				answer = sum;
			}
			// 왼쪽 상단
			for (int i = 0; i < n / 2; i++) {
				for (int j = 0; j < n / 2; j++) {
					if (i + j < n/2) {
						sum -= map[i][j];
					}
				}
			}
			// 오른쪽 상단.
			for (int i = 0; i < n / 2; i++) {
				for (int j = i + n / 2 + 1; j < n; j++) {
					sum -= map[i][j];
				}
			}
			// 왼쪽 하단.
			for (int i = n / 2 + 1; i < n; i++) {
				for (int j = 0; j < i - n / 2; j++) {
					sum -= map[i][j];
				}
			}

			// 오른쪽 하단.
			int cnt =0;
			for (int i = n-1; i > n/2; i--) {
				for (int j = n/2+1 + cnt; j < n; j++) {
					sum -= map[i][j];
				}cnt ++;
			}
			answer = sum;
			System.out.println("#"+tc+" "+answer);
		}
	}
}
