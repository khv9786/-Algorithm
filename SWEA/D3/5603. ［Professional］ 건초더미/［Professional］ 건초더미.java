import java.util.*;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int tc = 1; tc<=T; tc++) {
			int N = sc.nextInt();
			int sum = 0;
			int arr[] = new int[N];
			int answer = 0;
			for(int i = 0; i<N; i++) {
				int a = sc.nextInt();
				arr[i] = a;
				sum += a;
			}
			int temp = sum / N;
			
			for(int i = 0; i<N; i++) {
				answer += Math.abs(temp-arr[i]);
			}
			
			System.out.println("#"+tc+" "+answer/2);
			
			
		}
	}

}