import java.io.*;
import java.util.*;

class Solution { // swea 1984. 중간 평균값 구하기
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		String[] grade = { " ", "A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0" };
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			int arr[] = new int[N + 1];

			for (int i = 1; i <= N; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				int c = sc.nextInt();
				arr[i] = a * 35 + b * 45 + c * 20;
			}
			int cnt = 1; // 등수
			for (int i = 1; i <= N; i++) {
				if (K == i) {
					continue;
				}
				if (arr[K] < arr[i]) {
					cnt++;
				}
			}

			double tier = (cnt / (N / 10.0));
			for (int i = 0; i <= N; i++) {
				if (tier > i && tier <= i+1) {
					System.out.println("#" + tc + " " + grade[i+1]);
				}
			}

		}
	}
}
