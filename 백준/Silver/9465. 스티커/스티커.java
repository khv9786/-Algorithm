import java.util.*;

public class Main { // 백준 11403번 경로 찾기 S1
	// dp로 해결 N+1로 시작하자.. 
	public static int N, answer;
	public static int[][] arr;
	public static int[][] dp;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			N = sc.nextInt();
			arr = new int[2][N+1];
			dp = new int[2][N+1];

			for (int i = 0; i < 2; i++) {
				for (int j = 1; j <= N; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			// 맨 왼쪽을 상단을 선택하냐, 하단을 선택하냐
			// 중간에 건너띄우는 방법도 존재함을 고려
			dp[0][1] = arr[0][1];
			dp[1][1] = arr[1][1];
//			// 점화식
//			dp[0][2] = Math.max(dp[1][0],dp[1][1]) + arr[0][2];
//			dp[1][2] = Math.max(dp[0][0],dp[0][1]) + arr[1][2];
			for (int i = 2; i <= N; i++) {
				dp[0][i] = Math.max(dp[1][i - 2], dp[1][i - 1]) + arr[0][i];
				dp[1][i] = Math.max(dp[0][i - 2], dp[0][i - 1]) + arr[1][i];
			}

			int answer = Math.max(dp[0][N], dp[1][N]);
			System.out.println(answer);
		}
	}

}