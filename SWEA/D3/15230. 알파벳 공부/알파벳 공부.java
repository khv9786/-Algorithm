
import java.util.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		sc.nextLine();
		String [] alpha = new String[26];
		
		for(int tc = 1; tc <= T; tc++)
		{
			int answer = 0;
			
			String N = sc.nextLine();			
			for(int i = 0; i<N.length(); i++) {
				if(i == N.charAt(i) -'a') {
					answer ++;
				}else { // 연속적이지 않으면이 있으므로,
					break;
				}				
			}
	
			System.out.printf("#%d %d\n", tc, answer);
		}
		sc.close();

	}
}