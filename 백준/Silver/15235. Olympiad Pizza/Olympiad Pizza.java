import java.util.*;
import java.io.*;

public class Main { // Boj_15235_Olympiad Pizza
	public static int N;
	public static int[] arr, answer;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Queue <Integer> que = new LinkedList<>();
		N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		arr = new int[N];
		answer = new int[N];
		for(int i = 0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			que.add(i);
		}
		int time = 0;
		while(!que.isEmpty()) {
			int now = que.poll();
			time += 1;
			
			if( arr[now] > answer[now] ) {	
				answer[now] ++;
				if(arr[now] == answer[now] ) {
					answer[now] = time;
				}else {
					que.add(now);
				}
			}		
		}
		for(int s : answer) {
			sb.append(s+" ");
		}
		System.out.println(sb);

	}
}