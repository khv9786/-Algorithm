import java.util.*;

class Solution // Sweat 3431. 준환이의 운동관리 D3
{
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int answer = 0;
		for (int tc = 1; tc <= T; tc++) {
			int A = sc.nextInt();			
			int B = sc.nextInt();
			
			answer = (A + B) % 24;
			
			
			System.out.printf("#%d %s\n", tc, answer);
		}
		

	}
}
