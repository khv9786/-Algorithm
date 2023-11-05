import java.util.*;

class Solution {
	public static int answer = 0;
	public static int n;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int t = 1; t <= 10; t++) {
			int result = 0;
			int[][] arr = new int[8][8];

			int num = sc.nextInt();
			// 입력
			for (int i = 0; i < 8; i++) {
				String s = sc.next();
				for (int j = 0; j < 8; j++) {
					arr[i][j] = s.charAt(j);
				}
			}
			// 가로
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 8 - num + 1; j++) {
					int temp = 0;
					for (int k = 0; k < num / 2; k++) {
						if (arr[i][j + k] != arr[i][j + num - k - 1]) {
							temp = -1;
						}
					}
					if (temp == 0) {
						result++;
					}

				}
			}

			// 세로
			for (int i = 0; i < 8 - num + 1; i++) {
				for (int j = 0; j < 8; j++) {
					int temp = 0;
					for (int k = 0; k < num / 2; k++) {
						if (arr[i + k][j] != arr[i + num - k - 1][j]) {
							temp = -1;
						}
					}
					if (temp == 0) {
						result++;
					}

				}
			}
			System.out.println("#" + t + " " + result);
		}
	}

}
