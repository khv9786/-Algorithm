import java.util.*;

public class Main { // 1697 숨바꼭질 S1 25%
	// 빼거나 더하거나 *2하거나 BFS로 풀기

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		int t = Math.max(N, K);
		int answer = 0;
		int[] dp = new int[100001];
		
		if (N > K) {
			answer = Math.abs(K - N);
		} else {
			Arrays.fill(dp, 100001);
			dp[N] = 0;
			Queue<Integer> que = new LinkedList<>();
			que.add(N);
			while (!que.isEmpty()) {
				int tmp = que.poll();
				if (tmp == K) {
					answer = dp[tmp];
					break;
				}

				int a = tmp + 1;
				int b = tmp - 1;
				int c = tmp * 2;

				if (a < 100001 && dp[a] > dp[tmp] + 1) {
					dp[a] = dp[tmp] + 1;
					que.add(a);
				}
				if (b >= 0 && dp[b] > dp[tmp] + 1) {
					dp[b] = dp[tmp] + 1;
					que.add(b);
				}
				if (c < 100001) {
					if (dp[c] > dp[tmp] + 1) {
						dp[c] = dp[tmp] + 1;
						que.add(c);
					}
				}
			}
		}
		System.out.println(answer);
	}
}