import java.io.*;
import java.util.*;

class Solution { // 6913. 동철이의 프로그래밍 대회

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			
			int N = sc.nextInt();
			int M = sc.nextInt();
			int [] arr = new int [N];
			
			
			int Max = Integer.MIN_VALUE;
			int winner = 0;
			
			for(int i = 0; i<N; i++) {
				int sum = 0;
				for(int j = 0; j<M; j++) {
					int temp = sc.nextInt();
					if(temp == 0) continue;
					sum += 1;
				}
				arr[i] = sum;
				Max = Math.max(Max, sum);
			}
			
			for(int i = 0; i<N; i++) {
				if(arr[i] == Max){
					winner ++;
				}
			}
			
			System.out.println("#" + tc + " " + winner +" "+ Max);
		}
	}
}
