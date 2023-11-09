import java.util.*;

public class Main { // 백준 9663번 N-Queen G4
	// 행에는 1개는 Q만 존재한다.
	public static int answer, n;
	public static int[] map;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			n = sc.nextInt();
			map = new int[n];
			answer = 0;
			dfs(0);
			System.out.println(answer);
	}

	public static void dfs(int depth) {
		if (depth == n) {
			answer++;
			return;
		}
		for (int i = 0; i < n; i++) {
			map[depth] = i;
			if (range(depth)) {
				dfs(depth + 1);
			}
		}

	}

	public static boolean range(int r) {
		for (int i = 0; i < r; i++) {
			if (map[i] == map[r]) {
				return false;
			}
			// ex) 01 12은 같은 대각선상이다. 0 - 1 == 1 - 2
			if (Math.abs(r - i) == Math.abs(map[r] - map[i])) {
				return false;
			}
		}
		return true;
	}
}
