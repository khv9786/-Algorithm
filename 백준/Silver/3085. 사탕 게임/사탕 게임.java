import java.util.*;

public class Main { // 백준 11403번 경로 찾기 S1
	public static int N, answer;
	public static char[][] candy;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		candy = new char[N][N];
		answer = 0;
		for (int i = 0; i < N; i++) {
			String s = sc.next();
			for (int j = 0; j < N; j++) {
				candy[i][j] = s.charAt(j);
			}
		}
		find();

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (i < N - 1 && candy[i][j] != candy[i + 1][j]) {
					char tmp = candy[i][j];
					candy[i][j] = candy[i + 1][j];
					candy[i + 1][j] = tmp;
					find();
					candy[i + 1][j] = candy[i][j];
					candy[i][j] = tmp;
				}
				if (j < N - 1 && candy[i][j] != candy[i][j + 1]) {
					char tmp = candy[i][j];
					candy[i][j] = candy[i][j + 1];
					candy[i][j + 1] = tmp;
					find();
					candy[i][j + 1] = candy[i][j];
					candy[i][j] = tmp;
				}

			}
		}
		System.out.println(answer);
	}

	public static void find() {
		int cnt = 1;
		for (int i = 0; i < N; i++) {
			cnt = 1;
			for (int j = 0; j < N - 1; j++) {
				if (candy[i][j] == candy[i][j + 1]) {
					cnt++;
					answer = Math.max(answer, cnt);
				} else {
					cnt = 1;
				}
			}
		}
		cnt = 1;
		for (int i = 0; i < N ; i++) {
			cnt = 1;
			for (int j = 0; j < N-1; j++) {
				if (candy[j][i] == candy[j + 1][i]) {
					cnt++;
					answer = Math.max(answer, cnt);
				} else {
					cnt = 1;
				}
			}
		}
	}
}