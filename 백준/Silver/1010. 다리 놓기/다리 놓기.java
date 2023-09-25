import java.util.*;

public class Main { //  1010번 다리 놓기
	public static void main(String[] args) throws Exception {
		// 규칙이 조합과 동일. 1개만 놓기때문.
		// 다만 수가 너무 커지므로 연산을 기억해주는 dp[][] 생성. -> 재활용 위함
		// 물론 BigInteger을 사용해서도 가능.
		int [][] dp = new int[31][31];
		//input
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		
		for(int tc = 1; tc <= K; tc++) {
			int n = sc.nextInt(); // n = r
			int m = sc.nextInt(); // m = n
			int answer = 0;
			//logic
			//파스칼 활용. 2C1 + 2C2 = 3C2
			//r이 1인경우와 n과 m이같은 경우. 무조건 1
			for(int i = 1; i<31; i++) {
				dp[i][1] = i;
				for(int j = 2; j<31; j++) {
					if(i == j ) {
						dp[i][j] = 1;
					}
				}
			}
			for(int i = 2; i<31; i++) { // 2부터 진행해야함.
				for(int j = 2; j<31; j++) {				
					dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];					
				}		
			}
			answer = dp[m][n];
			
			// output
			System.out.println(answer);
		}
	}		
}