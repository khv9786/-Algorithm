import java.io.*;
import java.util.*;


public class Main { // Boj_16953_A->B
	public static long A,B, answer;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		A = Integer.parseInt(st.nextToken());
		B = Integer.parseInt(st.nextToken());
	
		System.out.println(bfs());
	}
	public static long bfs() {
		Queue<Long> que = new LinkedList<>();
		que.add(A);
		while(!que.isEmpty()) {
			int que_size = que.size();
			
			for(int i = 0; i<que_size; i++) {
				long now = que.poll();
				if( now == B) {
					return answer + 1; // 1추가가 있었네
				}
				if( now * 2 <= B) {
					que.add(now*2);
				}
				if(now * 10 + 1 <= B) {
					que.add(now * 10 + 1);
				}	
			}
			answer +=1;
		}
		return -1;
	}
}
