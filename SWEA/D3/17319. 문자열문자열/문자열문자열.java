
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
			String S = sc.next();
			boolean bl = true;
			String str = "";
			
			if(N % 2 != 0) { // 길이가 짝수가 아니면 어짜피 불가능.
				bl = false;				
			}else {
				for(int i = 0; i<N/2; i++) {
				if(S.charAt(i) == (S.charAt(N/2 + i)) && bl == true) {					
				}else {
					bl = false;
					break;
					}//inner else
				}// for
			}//out else
		    
			str = (bl == true) ? "Yes" : "No";
			System.out.printf("#%d %s\n", tc, str);
		}
		sc.close();

	}
}