
import java.util.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		sc.nextLine();
		
		for(int tc = 1; tc <= T; tc++)
		{
			int N = sc.nextInt();
	
			System.out.printf("#%d %d\n", tc, N*N);
		}
		sc.close();

	}
}