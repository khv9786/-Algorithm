import java.util.*;
import java.io.*;

public class Main {// 10026번 적록색약
	// 탐색
	static int N;
	static String S;
	static boolean[][] visit;
	static char[][] arr;
	static StringBuilder sb;
	static int[] dr = { 0, 0, 1, -1 };
	static int[] dc = { 1, -1, 0, 0 };

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());
		arr = new char[N][N];
		visit = new boolean[N][N];

		for (int i = 0; i < N; i++) {
			S = br.readLine();
			for (int j = 0; j < N; j++) {
				arr[i][j] = S.charAt(j);
			}
		}
		
		
		int normal_cnt = 0;
		int un_normal_cnt = 0;

		sb = new StringBuilder();

		for (int j = 0; j < N; j++) {
			for (int k = 0; k < N; k++) {
				if (visit[j][k])
					continue;

				Queue<int[]> que = new LinkedList<>();
				que.add(new int[] { j, k });
				normal_cnt++;
				visit[j][k] = true;
				while (!que.isEmpty()) {
					int[] cur = que.poll();
					int cur_r = cur[0];
					int cur_c = cur[1];
					for (int i = 0; i < 4; i++) {
						int r = cur_r + dr[i];
						int c = cur_c + dc[i];
						if (r < 0 || c < 0 || r >= N || c >= N)
							continue;
						if (arr[cur_r][cur_c] == (arr[r][c]) && !visit[r][c]) {
							visit[r][c] = true;
							que.add(new int[] { r, c });
						}
					}
				}
			}
		}
		visit = new boolean[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (arr[i][j] == 'G') {
					arr[i][j] = 'R';
				}
			}
		}
		for (int j = 0; j < N; j++) {
			for (int k = 0; k < N; k++) {
				if (visit[j][k])
					continue;

				Queue<int[]> que = new LinkedList<>();
				que.add(new int[] { j, k });
				un_normal_cnt++;
				visit[j][k] = true;
				while (!que.isEmpty()) {
					int[] cur = que.poll();
					int cur_r = cur[0];
					int cur_c = cur[1];
					for (int i = 0; i < 4; i++) {
						int r = cur_r + dr[i];
						int c = cur_c + dc[i];
						if (r < 0 || c < 0 || r >= N || c >= N)
							continue;
						if (arr[cur_r][cur_c] == (arr[r][c]) && !visit[r][c]) {
							visit[r][c] = true;
							que.add(new int[] { r, c });
						}
					}
				}
			}
		}
		sb.append(normal_cnt + " " + un_normal_cnt);
		System.out.println(sb);
	}
}
