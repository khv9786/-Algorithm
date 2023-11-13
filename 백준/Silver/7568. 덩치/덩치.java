import java.util.*;

public class Main { // 백준 11403번 경로 찾기 S1

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] arr = new int[N][2];
		int[] answer = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i][0] = sc.nextInt(); // weight
			arr[i][1] = sc.nextInt(); // height
		}
		for (int i = 0; i < N; i++) {
			int tier = 1;
			for (int j = 0; j < N; j++) {
				if (i == j) {
					continue;
				}
				if ((arr[i][0] < arr[j][0] && (arr[i][1] < arr[j][1]))) {
					tier ++;
				}
			}
			answer[i] = tier;
		}
		for (int i = 0; i < N; i++) {
			if (i < N - 1) {
				System.out.print(answer[i] + " ");
			} else {
				System.out.print(answer[i]);
			}
		}
	}
}