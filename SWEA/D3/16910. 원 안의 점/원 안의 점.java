
import java.util.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        
		for(int tc = 1; tc <= T; tc++)
		{
			 int N = sc.nextInt();
			 int p = 0;
			 int sum = 0;
		        for(int a = 1; a<=N; a++) { // N^2 >= 경우 계산
					 for(int b = 1; b<=N; b++) {
						if( N*N >= a*a + b*b ) {
							p++;
						}
					 }
				 }
		    sum = 4*p + 4*N + 1;
		
			System.out.printf("#%d %d\n",tc, sum);
		}

	}
}