
import java.util.*;

class Solution {

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int answer = 0;
			
			String s = sc.next();
			int cnt = 0;
			for (int i = 0; i < s.length(); i++) {
				int a = s.charAt(i) - '0';
				if(cnt >= i) {

					cnt += a;
					
				}else {
					
					answer += i - cnt;
					cnt = i + a;
					
				}
				
			}
		
			StringBuilder sb = new StringBuilder();
			sb.append("#" + tc + " "+ answer);

			System.out.println(sb);
		}
	}
}