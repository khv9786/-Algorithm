import java.util.*;

class Solution // Sweat 1289. 원재의 메모리 복구하기
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();

		for (int tc = 1; tc <= T; tc++) {
			int answer = 0;
			char tmp = '0';
			String s = sc.nextLine();
			for (int i = 0; i < s.length(); i++) {
				if (tmp != s.charAt(i)) {
					tmp = s.charAt(i);
					answer++;
				}
			}
			System.out.printf("#%d %d\n", tc, answer);
		}
	}
}
