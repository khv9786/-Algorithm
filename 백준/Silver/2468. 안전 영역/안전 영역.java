import java.util.*;

public class Main { // 2468번 안전영역 S1
	public static int[] dr = { -1, 1, 0, 0 }; // 상하좌우
	public static int[] dc = { 0, 0, -1, 1 };
	public static int N, answer, Max, Min;
	public static boolean [][] visited;
	public static int [][] map;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		map = new int[N][N];
		Max = Integer.MIN_VALUE;
		Min = Integer.MAX_VALUE;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				map[i][j] = sc.nextInt();
				Max = Math.max(Max, map[i][j]);
				Min = Math.min(Min, map[i][j]);
			}
		}
		answer = 1;
		for(int i = Min; i<Max; i++) {
			visited = new boolean[N][N];
			int cnt = 0;
			for(int j = 0; j<N; j++) {
				for(int k = 0; k<N; k++) {
					if (!visited[j][k] && map[j][k] > i) {					
						dfs(j,k,i);
						cnt ++;
					}
				}
			}
			answer = Math.max(answer, cnt);
		}
		System.out.println(answer);
		

	}
	public static void dfs(int r, int c, int max) {
		visited[r][c] = true;
		for(int i = 0; i<4; i++) {
			int next_r = r+dr[i];
			int next_c = c+dc[i];
			if(!rangechk(next_r,next_c)) {
				continue;
			}
			if(map[next_r][next_c] > max && !visited[next_r][next_c]) {
				visited[next_r][next_c] = true;
				dfs(next_r,next_c,max);
			}
		}
	}
	public static boolean rangechk(int r, int c) {
		return r >= 0 && c >= 0 && r < N && c < N;
	}
}