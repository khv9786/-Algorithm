import java.util.*;

public class Main { // 백준 2579 계단 오르기 실3

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int answer = 0;
		int N = sc.nextInt();
		int  arr[] = new int[N + 1];
		int dp[] = new int[N + 1];
		for (int i = 1; i <= N; i++) {
			arr[i] = sc.nextInt();
		}
		
		dp[0] = 0;
		if(N >= 1) {
			dp[1] = arr[1];
		}
		if(N>=2) {
			dp[2] = arr[1] + arr[2];
		}
		if(N>=3) {
			dp[3] = Math.max((arr[1] + arr[3]), (arr[2] + arr[3]));
		}
		

		for (int i = 4; i <= N; i++) {
			dp[i] = Math.max((arr[i] + dp[i-2]),(arr[i] + arr[i-1] + dp[i-3]));
		}
		System.out.println(dp[N]);
	}
}