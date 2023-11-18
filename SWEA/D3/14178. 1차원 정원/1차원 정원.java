
import java.util.*;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int D = sc.nextInt();
			int range = 2 * D +1;
			int temp = N % range;
			int div = N / range;
			if(temp >= 1){
				div ++;
			}
			
			
			System.out.println("#" + tc + " " + div);
		}
	}
}