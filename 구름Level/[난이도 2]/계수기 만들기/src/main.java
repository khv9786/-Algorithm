import java.io.*;
import java.util.*;

class Main { // 구름Level 난이도 2 - 계수기 만들기
	// 단순 구현문제.
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int [] A = new int[N];
		int [] B = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i<N; i++){
			A[i] = Integer.parseInt(st.nextToken());
		}

		st = new StringTokenizer(br.readLine());
		for(int i = 0; i<N; i++){
			B[i] = Integer.parseInt(st.nextToken());
		}

		st = new StringTokenizer(br.readLine());
		int K = Integer.parseInt(st.nextToken());
		
		B[N-1] += K;
		for(int i = N-1; i>= 0; i--){
			int tmp = B[i];
			B[i] = tmp % (A[i]+1);
			if(i == 0){
				continue;
			}
			B[i-1] += tmp / (A[i]+1);
		}
		int idx = 1;
		StringBuilder answer = new StringBuilder();
		for(int i = 0; i < N; i++){
			answer.append(B[i]);
		}
		
		System.out.printf(String.valueOf(answer));
	}
}