import java.util.*;

public class Main { // 15650번 N과 M 74%
	// 백트래킹
	public static StringBuilder sb = new StringBuilder();
	public static int[] arr;
	public static int N, M;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// input
		N = sc.nextInt(); // 3
		M = sc.nextInt(); // 1
		arr = new int[M]; // 수열 담을 배열

		dfs(1, 0);
		System.out.println(sb);
	}

	// logic - dfs
	public static void dfs(int idx, int size) {
		if (size == M) {
			for (int tmp : arr) {
				sb.append(tmp + " ");
			}sb.append("\n");
		} else {
			for (int i = idx; i <= N; i++) {
				arr[size] = i;
				dfs(i + 1, size + 1);
			}
		}

	}
}
