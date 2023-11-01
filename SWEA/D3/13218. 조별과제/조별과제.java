import java.util.*;

class Solution // Sweat 13218. 조별과제 D3
{
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int answer;
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();			
			answer = N / 3;			
			System.out.printf("#%d %s\n", tc, answer);
		}
		

	}
}
