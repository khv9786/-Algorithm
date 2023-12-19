import java.util.*;
import java.io.*;

public class Main {// 12865번 평범한 배낭
	// 배낭 문제, 다이나믹 프로그래밍
	static int N, K;
	static int[][] dp;
	static int[] W,V;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		W = new int [N+1];
		V = new int[N+1];
		dp = new int[N + 1][K + 1];
		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());
			W[i] = Integer.parseInt(st.nextToken());
			V[i] = Integer.parseInt(st.nextToken());
		}

		// 가방에 물건을 넣을 수 있으면 넣는다.
		// 가방에 공간이 부족한경우, 안에 물건과 가치를 비교해서 넣는다. i = 가방번호, j = 무게
		for(int i = 1; i<=N; i++) {
			for(int j = 1; j<=K; j++) {
				dp[i][j] = dp[i-1][j];
				if(j >= W[i]) {
					// 가방의 크기를 나눠준다 생각.
					dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-W[i]] + V[i]);
				}
			}
		}
		
		
		System.out.println(dp[N][K]);
	}	
}
