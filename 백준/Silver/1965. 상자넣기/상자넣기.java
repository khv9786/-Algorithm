import java.util.*;

public class Main { // 1965 상자 넣기 49%
	// DP 인듯
	// 1 3 2 3 4 의 경우 1 3 4 와 1 2 3 4 두가지로 구분.
	// 연속적인 수열이 되면 dp 값 수정
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        //input
        int n = sc.nextInt();
        int [] arr = new int[n];
        int [] dp = new int[n];
        for(int i = 0; i<n; i++) {
        	arr[i] = sc.nextInt();
        }
        Arrays.fill(dp,1); // 모두 1로 채우기.
        int answer = 0;
        
        for(int i = 0; i<n; i++) {
        	for(int j = 0; j<=i; j++) {
        		if(arr[i] > arr[j]) { // 연속적인 수열이라면
        			dp[i] = Math.max(dp[i], dp[j]+1); // 이전 최대값과 비교
        		}           		
        	}
        	answer = Math.max(answer,dp[i]);
        }
        
        System.out.println(answer);
        sc.close();
    }
}
