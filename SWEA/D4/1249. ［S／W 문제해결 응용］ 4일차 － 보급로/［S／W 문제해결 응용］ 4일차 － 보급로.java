
import java.util.*;

class Solution { // 1249. [S/W 문제해결 응용] 4일차 - 보급로

	public static boolean visit[][];
	public static int cost[][];
	public static int arr[][];
	public static int dr[] = { -1, 1, 0, 0 };
	public static int dc[] = { 0, 0, -1, 1 };
	public static int n, answer;

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {

			n = sc.nextInt();
			sc.nextLine();
			arr = new int[n][n];
			visit = new boolean[n][n];
			cost = new int[n][n];
			for (int i = 0; i < n; i++) {
				String s = sc.nextLine();
				for (int j = 0; j < n; j++) {
					arr[i][j] = (s.charAt(j) - '0');
				}
			}
			Queue<int[]> que = new LinkedList<>();
			visit[0][0] = true;
			que.add(new int[] { 0, 0 });

			while (!que.isEmpty()) {
				int[] cur = que.poll();
				int r = cur[0];
				int c = cur[1];

				for (int i = 0; i < 4; i++) {
					int next_r = r + dr[i];
					int next_c = c + dc[i];
					if (!rangeChk(next_r, next_c))
						continue;

					// 처음 방문이라면
					if (!visit[next_r][next_c]) {
						// 현재위치 비용 + 다음 자리 비용
						cost[next_r][next_c] = cost[r][c] + arr[next_r][next_c];
						visit[next_r][next_c] = true;
						que.add(new int[] { next_r, next_c });
					} else {
						// 다른 경로가 있다면 최소값 넣기.
						int now_cost = cost[r][c] + arr[next_r][next_c];
						if (now_cost < cost[next_r][next_c]) {
							cost[next_r][next_c] = now_cost;
							que.add(new int[] { next_r, next_c });
						}

					}
				}
			}

			answer = cost[n - 1][n - 1];
			StringBuilder sb = new StringBuilder();
			sb.append("#" + tc + " " + answer);

			System.out.println(sb);
		}
	}

	public static boolean rangeChk(int r, int c) {
		return 0 <= r && 0 <= c && r < n && c < n;

	}
}