import java.util.*;

class Solution { // 2068. 최대수 구하기 D1
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int answer = 0;
			for(int i = 0; i<10; i++) {
				int n = sc.nextInt();
				answer = Math.max(answer, n);
			}
			System.out.println("#"+tc+" "+answer);
		}
	}
}
