import java.util.*;
import java.io.*;

public class Main {// 2116번 주사위 쌓기 G5
	// 브루트 포스로 접근
	// A-F, B-D, C-E -? 1-6, 2-4, 3,5
	static int N, answer;
	static int[][] dice;
	static int[] other = {0, 6, 4, 5, 2, 3, 1 };

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		answer = -1;
		dice = new int[N][7];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= 6; j++) {
				dice[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		// 첫번째 주사위 상단 인덱스 선택
		for (int i = 1; i <= 6; i++) {
			int max = 0;
			// 반대편 및 상단 제외
			for (int j = 1; j <= 6; j++) {
				if (j == other[i] || i == j) {
					continue;
				}
				// 옆면 최대값 
				max = Math.max(dice[0][j], max);
			}
			stack(1, dice[0][i], max);
		}
		System.out.println(answer);
	}

	public static void stack(int depth, int top, int sum) {
		if (depth == N) {
			answer = Math.max(answer, sum);
			return;
		}
		// top 숫자가 다음 주사위의 어떤 idx인지 판단
		int bottom_idx = 0; 
		int top_idx = 0;
		
		for (int i = 1; i <= 6; i++) {
			if (top == dice[depth][i]) {
				bottom_idx = i;
				top_idx = other[i];
			}
		}
		
		int max = 0;
		int next_top = dice[depth][top_idx];
		
		for (int j = 1; j <= 6; j++) {
			if (j == bottom_idx || top_idx == j) {
				continue;
			}
			max = Math.max(dice[depth][j], max);
		}
		stack(depth + 1, next_top, sum + max);

	}
}
