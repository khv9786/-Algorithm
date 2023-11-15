import java.util.*;

public class Main { // 백준 11659번 구간 합 구하기 4
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int [] num = new int[N+1];
		int [] dp = new int[N+1]; 
		for(int i = 1; i<=N; i++) {
			num[i] = sc.nextInt();
		}
		dp[0] = 0;
		for(int i = 1; i<=N; i++) {
			dp[i] = dp[i-1] + num[i];
		}
		int answer = 0;
		for(int i = 1; i<=M; i++) {
			int start = sc.nextInt();
			int end = sc.nextInt();
			
			answer = dp[end] - dp[start-1];
			System.out.println(answer);
		}
		
	}

}