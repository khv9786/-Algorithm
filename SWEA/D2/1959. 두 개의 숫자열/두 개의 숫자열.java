import java.io.*;
import java.util.*;

class Solution { // swea 1959. 두 개의 숫자열 D2
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int A_arr[] = new int [A];
			int B_arr[] = new int [B];
			
			for(int i = 0; i<A; i++) {
				A_arr[i] = sc.nextInt();
			}
			for(int i = 0; i<B; i++) {
				B_arr[i] = sc.nextInt();
			}
			
			int answer = Integer.MIN_VALUE;
			
			if(A >= B) {
				for(int i = 0; i<= A-B; i++) {
					int sum = 0;
					for(int j = 0; j<B; j++) {
						sum += A_arr[j+i] * B_arr[j];
					}
					answer = Math.max(answer, sum);
				}
			}else {
				for(int i = 0; i<= B-A; i++) {
					int sum = 0;
					for(int j = 0; j<A; j++) {
						sum += A_arr[j] * B_arr[j+i];
					}
					answer = Math.max(answer, sum);
				}
			}
			
			System.out.println("#"+tc+" "+answer);
		}
	}
}
