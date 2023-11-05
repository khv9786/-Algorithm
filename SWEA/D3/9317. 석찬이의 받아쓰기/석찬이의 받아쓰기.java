import java.util.*;

class Solution {
	public static int answer = 0;
	public static int n;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();	
		sc.nextLine();
		for (int tc = 1; tc <= T; tc++) {
			n = sc.nextInt();
			sc.nextLine();
			String s = sc.nextLine();
			String copy_s = sc.nextLine();

			for (int i = 0; i < n; i++) {
				if(s.charAt(i) == copy_s.charAt(i)) {
					answer ++;
				}
			}

			System.out.printf("#%d %d\n", tc, answer);
			answer = 0; // 다음 테스트 케이스를 위해 결과 초기화
		}
	}
}
