
import java.util.*;

class Solution { //6692. 다솔이의 월급 상자 D3
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {

			int N = sc.nextInt();
			 double answer = 0;
	            for(int i=0; i<N; i++){
	                double p = sc.nextDouble();
	                int n = sc.nextInt();

	                answer += p * n;

	            }
			StringBuilder sb = new StringBuilder();
			sb.append("#" + tc + " " + answer);

			System.out.println(sb);
		}
	}
}