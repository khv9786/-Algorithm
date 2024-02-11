import java.io.*;
import java.util.*;

class Solution { // 4193. 수영대회 결승전 D4
	public static int[][] map;
	public static boolean[][] visit;
	public static int N, s_r, s_c, e_r, e_c, answer;
	public static int[] dr = { 1, -1, 0, 0 };
	public static int[] dc = { 0, 0, -1, 1 };

	static class Swimmer {
		int r, c, time;

		public Swimmer(int r, int c, int time) {
			this.r = r;
			this.c = c;
			this.time = time;
		}
	}

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		// 테케
		int T = Integer.parseInt(br.readLine());
		for (int Tc = 1; Tc <= T; Tc++) {
			// 수영장 범위
			N = Integer.parseInt(br.readLine());
			map = new int[N][N];
			visit = new boolean[N][N];
			// input -------------------------------
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < N; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			st = new StringTokenizer(br.readLine());
			s_r = Integer.parseInt(st.nextToken());
			s_c = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine());
			e_r = Integer.parseInt(st.nextToken());
			e_c = Integer.parseInt(st.nextToken());
			// -------------------------------------
			if (arrive(s_r,s_c)) {
				System.out.println("#" + Tc + " " + 0);
				continue;
			}
			bfs();
			System.out.println("#" + Tc + " " + answer);
		}
	}

	// 소용돌이는 time % 3 == 2일때 이동 가능, 아니면 제자리
	public static void bfs() {
		Queue<Swimmer> que = new LinkedList<>();
		que.add(new Swimmer(s_r, s_c,0));
		while(!que.isEmpty()) {
			Swimmer swimmer = que.poll();
			int now_r = swimmer.r;
			int now_c = swimmer.c;
			int time = swimmer.time;
			for(int i = 0; i<4; i++) {
				int r = now_r + dr[i];
				int c = now_c + dc[i];
				if(!range(r,c)) continue;
				if(arrive(r,c)) {
					answer = time + 1;
					return;
				}
				// 소용돌이
				if(map[r][c] == 2) {
					if(time % 3 == 2) {
						visit[r][c] = true;
						que.add(new Swimmer(r,c,time+1));
					}else {
						visit[now_r][now_c] = true;
						que.add(new Swimmer(now_r,now_c,time+1));
					}
				}
				// 이동가능할때
				if(map[r][c] == 0) {
					visit[r][c] = true;
					que.add(new Swimmer(r,c,time+1));
				}
				// 장애물
				if(map[r][c] == 1) continue;
				
			}
		}
		answer = -1;
		return;
	}

	public static boolean range(int r, int c) {
		return r >= 0 && c >= 0 && r < N && c < N && !visit[r][c];
	}
	public static boolean arrive(int r, int c) {
		return r == e_r && c == e_c;
	}
}
