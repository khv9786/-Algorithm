import java.util.*;

class Solution // Sweat 1986. 지그재그 숫자 D2

{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int answer = 0;

			for (int i = 1; i <= N; i++) {
                if (i % 2 == 1) {
                    answer += i;
                } else {
                    answer -= i;
                }
            }

			System.out.printf("#%d %d\n", tc, answer);
		}
	}
}
