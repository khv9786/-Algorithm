import java.util.*;

public class Main { // 백준 7576번 토마토 G5
	// 1찾으면 큐에 넣기. 주변에 0 있으면 2로 변경
	// 토마토 중 높은 숫자 넣기
	public static int[] dr = { -1, 1, 0, 0 };
	public static int[] dc = { 0, 0, -1, 1 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int arr[][] = new int[M][N];
		Queue<int[]> que = new LinkedList<>();
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				arr[i][j] = sc.nextInt();
				if (arr[i][j] == 1) {
					que.add(new int[] { i, j });
				}
			}
		}
		// 0 은 안익은 토마토, 1은 익은 토마토, -1은 없는 토마토.
		while (!que.isEmpty()) {
			int[] cur = que.poll();
			int r = cur[0];
			int c = cur[1];
			for (int k = 0; k < 4; k++) {
				int next_r = r + dr[k];
				int next_c = c + dc[k];

				if (next_r >= 0 && next_c >= 0 && next_r < M && next_c < N) {
					if (arr[next_r][next_c] == 0) {
						que.add(new int[] { next_r, next_c });
						arr[next_r][next_c] = arr[r][c] + 1;
					}
				}
			}
		}

		int answer = Integer.MIN_VALUE;
		Loop1: for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if (arr[i][j] == 0) {
					answer = -1;
					break Loop1;
				}
				answer = Math.max(answer, arr[i][j]);
			}
		}

		if (answer == 1) {
			System.out.println(0);
		} else if (answer == -1) {
			System.out.println(-1);
		} else {
			System.out.println(answer-1);
		}

		// 아 큐 순서에따라 값이 다르더라, 큐에 넣는거랑 로직이랑 분리하자.
//		6 4
//		1 -1 0 0 0 0
//		0 -1 0 0 0 0
//		0 0 0 0 -1 0
//		0 0 0 0 -1 1
//
//		1 -1 7 8 9 10 
//		2 -1 6 7 8 9 
//		3 4 5 6 -1 10 
//		4 5 6 7 -1 1 

	}

}