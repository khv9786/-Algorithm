import java.util.*;

class Solution // Sweat 3431. 준환이의 운동관리 D3
{
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int answer = 0;
		for (int tc = 1; tc <= T; tc++) {
			int L = sc.nextInt();			
			int U = sc.nextInt();
			int X = sc.nextInt();
			
			if(L <= X && X <= U) {
				answer = 0;
			}
			
			if(X < L) {
				answer = L - X;
			}
			
			if(X > U) {
				answer = -1;
			}
			
			System.out.printf("#%d %s\n", tc, answer);
		}
		

	}
}
