import java.util.*;

class Solution{ // Sweat 1288. 새로운 불면증 치료법 D2
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int[] arr = new int[10];
			int answer = 0;
			int N = sc.nextInt();
			int idx = 1;
			int sheep = 0;
			while (!chk(arr)) {
				sheep  = N * idx;
				int temp = sheep;
				while (temp > 0) {
					int digit = temp % 10;
					arr[digit] = 1;
					temp /= 10;
				}
				idx++;
			}
			System.out.printf("#%d %d\n", tc, sheep);
		}
	}

	public static boolean chk(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				return false;
			}
		}
		return true;
	}

}
