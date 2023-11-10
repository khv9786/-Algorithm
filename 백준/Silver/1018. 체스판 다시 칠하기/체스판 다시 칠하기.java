import java.util.*;

public class Main { // 1018번 백준 체스판 다시 칠하기
	public static char arr[][];
	public static int answer = Integer.MAX_VALUE;

	public static void main(String[] args) throws Exception {
		// input
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		sc.nextLine();
		arr = new char[M][N];
		for (int i = 0; i < M; i++) {
			String s = sc.nextLine();
			for (int j = 0; j < N; j++) {
				arr[i][j] = s.charAt(j);
			}
		}

		for (int i = 0; i <= M - 8; i++) {
			for (int j = 0; j <= N - 8; j++) {
				painting(i, j);
			}
		}

		// output
		System.out.println(answer);
	}

	public static void painting(int r, int c) {
		int paint = 0;
		for (int i = r; i < r + 8; i++) {
			for (int j = c; j < c + 8; j++) {
				if ((i + j) % 2 == 0) {
					if (arr[i][j] != 'B') {
						paint++;
					}
				} else {
					if (arr[i][j] != 'W') {
						paint++;
					}
				}
			}
		}
		answer = Math.min(answer, paint);
		paint = 0;
		for (int i = r; i < r + 8; i++) {
			for (int j = c; j < c + 8; j++) {
				if ((i + j) % 2 == 0) {
					if (arr[i][j] != 'W') {
						paint++;
					}
				} else {
					if (arr[i][j] != 'B') {
						paint++;
					}
				}
			}
		}
		answer = Math.min(answer, paint);
	}
}