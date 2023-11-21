
import java.util.*;

class Solution {
	

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
		int money = sc.nextInt();
		int [] unit = {50000,10000,5000,1000,500,100,50,10};
		int idx = 0;
		int [] answer = new int[8];
		while (money >= 10) {
			if(money >= unit[idx]) {
				money -= unit[idx];
				answer[idx] += 1;
			}else {
				idx ++;
			}
		}
		StringBuilder sb =new StringBuilder();
		sb.append("#" + tc+"\n");
		for(int i = 0; i<answer.length; i++) {
			sb.append(answer[i]);
			sb.append(" ");
		}
			System.out.println(sb);
		}
	}
}