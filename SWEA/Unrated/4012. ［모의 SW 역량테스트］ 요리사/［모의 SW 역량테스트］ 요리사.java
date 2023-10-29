import java.util.*;

class Solution {
	static // swea 4012. [모의 SW 역량테스트] 요리사
	// 구현 문제 같은데? N/2개 이므로 nCn/2 개의 경우 수 모두 구해서 비교?
	// N 이 6이라면 3개 시너지를 고려해야함. 12 21 13 31 23 32 처럼
	// 그럼 12나 21에 값을 미리 합해 놓고 거기만 씁시다. 네
	int N;
	static int[][] Recipes;
	static boolean[] used;
	static int answer ;

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			N = sc.nextInt();
			// 숫자 그대로 사용하기 위해 N+1 사용.
			Recipes = new int[N + 1][N + 1];
			used = new boolean[N + 1];
			answer = Integer.MAX_VALUE;
			// input
			for (int i = 1; i <= N; i++) {
				for (int j = 1; j <= N; j++) {
					Recipes[i][j] = sc.nextInt();
				}
			}
			for (int i = 1; i <= N; i++) {
				for (int j = 1; j <= N; j++) {
					// 대각선 기준 위쪽으로 시너지 합 저장.
					if (i < j) {
						Recipes[i][j] += Recipes[j][i];
						Recipes[j][i] = 0;
					}
				}
			}
			PickIngredients(0, 1);
			System.out.printf("#%d %d\n", tc, answer);

		} // Tc - for
	}

	// 재료 시너지를 두 개로 나누어서 + - 로 최저값 계산
	public static void PickIngredients(int n, int first) {
		if (n == N / 2) {
			int Min = 0;
			// 대각선은 0이라서 N-1까지
			for (int i = 1; i < N; i++) {
				for (int j = i + 1; j <= N; j++) {
					if (!used[i] && !used[j]) {
						Min += Recipes[i][j];
					}
					if (used[i] && used[j]) {
						Min -= Recipes[i][j];
					}
				}
			}
			answer = Math.min(Math.abs(Min), answer);
			return;

		}
		// N/2하는 모든 경우의 수 계산
		for (int i = first; i <= N; i++) {
			used[i] = true;
			PickIngredients(n + 1, i + 1);
			used[i] = false;
		}
	}
}
