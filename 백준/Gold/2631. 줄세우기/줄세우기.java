import java.util.*;
import java.io.*;

public class Main {// Boj_2631_줄세우기
	// LIS DP로 해결, 가장 긴 연속 배열을 찾고 나머지를 바꿔주면 해결
	static int answer;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int dp [] = new int [N];
        int arr [] = new int [N];
        answer = 0;
        for(int i = 0; i<N; i++) {
        	arr[i] = Integer.parseInt(br.readLine());
        }
        dp[0] = 1;
        for(int i = 1; i<N; i++) {
        	dp[i] = 1;
        	for(int j = 0; j<i; j++) {
        		if(arr[i] > arr[j]){
        			// 이전 값과 비교
        			dp[i] = Math.max(dp[i], dp[j] + 1);
        		}	
        	}
        	answer = Math.max(dp[i], answer);
        }
        
//        for(int s: dp) {
//        	System.out.println(s);
//        }
        System.out.println(N-answer);
        
        }
}