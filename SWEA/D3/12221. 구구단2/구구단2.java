import java.util.*;

class Solution // Sweat 12221. 구구단2 D3
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {			
			int a = sc.nextInt();
			int b = sc.nextInt();
			int answer = a * b;
			if(a >=10 || b>= 10) {
				answer = -1;			
			}
			System.out.printf("#%d %d\n", tc, answer);
		}
	}
}
