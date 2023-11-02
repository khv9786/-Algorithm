import java.util.*;

class Solution // Sweat 12221. 구구단2 D3
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {			
			String s = sc.next();
			int a =1;
			int b =1;
			for(int i =0; i<s.length(); i++) {
				if(s.charAt(i)=='L') {
					b += a;
				}
				
				if(s.charAt(i)=='R'){
					a += b;
				}
			}
			
			System.out.printf("#%d %d %d\n", tc, a,b);
		}
	}
}
