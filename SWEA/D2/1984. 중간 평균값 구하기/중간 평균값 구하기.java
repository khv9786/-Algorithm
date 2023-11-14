import java.io.*;
import java.util.*;

class Solution { // swea 1984. 중간 평균값 구하기
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int arr[] = new int[10];
			for (int i = 0; i < 10; i++) {
				arr[i] = sc.nextInt();
			}
			Arrays.sort(arr);
			int sum = 0;
			for (int i = 1; i < 9; i++) {
				sum += arr[i];
			}

			//Math.round 잊고있었다. 계속 8로 나눴는데 8.0 했어야해.
			System.out.println("#" + tc + " " + Math.round(sum / 8.0));
		}
	}
}
