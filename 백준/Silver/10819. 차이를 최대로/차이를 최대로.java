import java.util.*;
import java.io.*;

public class Main {// 10819번 S2
	// 완전 탐색

	static int N, answer;
	static int[] arr, copy_arr;
	static boolean[] visit;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		arr = new int[N];
		copy_arr = new int [N];
		visit = new boolean[N];
		answer = 0;
		int chk = 13;
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		dfs(0);
		bw.write(String.valueOf(answer)); 
		bw.flush();
		bw.close();
	}

	public static void dfs(int depth) {
		if(depth == N) {
			int sum = 0;
			for(int i = 0; i<N-1; i++) {
				sum += Math.abs(copy_arr[i] - copy_arr[i+1]);
			}
			answer = Math.max(sum,answer);
			return;
		}
		
		for(int i = 0; i<N; i++) {
			if(visit[i])
				continue;
			copy_arr[depth] = arr[i];
			visit[i] = true;
			dfs(depth + 1);
			visit[i] = false;
		}
	}
	
}
