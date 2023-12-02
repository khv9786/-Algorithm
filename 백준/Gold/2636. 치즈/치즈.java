import java.util.*;
import java.io.*;


public class Main {// 2636번 치즈 G4
	
	public static int [] dr = {-1,1,0,0};
	public static int [] dc = {0,0,-1,1};
	static int N,M,time,cheese,last_cheese;
	static int [][] arr;
	static boolean[][] visit;
	
	public static  void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[N][M];
		
		for(int i = 0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j<M; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i = 0; i<N; i++) {
			for(int j = 0; j<M; j++) {
				if(arr[i][j] == 1) {
					cheese ++;
				}
			}
		}
		
		while(cheese > 0) {
			time ++;
			last_cheese = cheese;
			bfs();			
		}		
		
		bw.write(time+"\n");
		bw.write(last_cheese+"\n");
		bw.flush();
		bw.close();
	}
	
	public static void bfs () {
		Queue <int []> que = new LinkedList<>();
		que.add(new int [] {0,0});
		visit = new boolean[N][M];
		visit[0][0] = true;
		while(!que.isEmpty()) {
			int [] cur = que.poll();
			int now_r = cur[0];
			int now_c = cur[1];
			
			for(int k = 0; k<4; k++) {
				int r = now_r + dr[k];
				int c = now_c + dc[k];
				
				if(!rangechk(r, c))
					continue;
				if(visit[r][c])
					continue;
				visit[r][c] = true;
				
				if(arr[r][c] == 1) {
					arr[r][c] = 0;
					cheese --;
				}else {
					que.add(new int [] {r,c});
				}
			}			
		}
	}
	
	public static boolean rangechk(int r, int c) {
		return 0 <= r && 0 <= c && r < N && c < M;
	}
}
