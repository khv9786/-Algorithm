import java.io.*;
import java.util.*;

class Solution { // swea 2005. 파스칼의 삼각형
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int n = sc.nextInt();
			StringBuilder sb = new StringBuilder();
			int dp[][] = new int[n][n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (j == 0) {
						dp[i][j] = 1;
					}
					if (i == j) {
						dp[i][j] = 1;
					}
				}
			}
			for (int i = 2; i < n; i++) {
				for (int j = 1; j < n; j++) {
					dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
				}
			}

			sb.append("#");
			sb.append(tc);
			for (int i = 0; i < n; i++) {
				sb.append("\n");
				for (int j = 0; j < n; j++) {
					if(dp[i][j] == 0) {
						continue;
					}
					sb.append(dp[i][j]);
					sb.append(" ");
				}
			}
			System.out.println(sb);
		}
	}
}
