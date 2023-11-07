import java.util.*;

class Solution {
	public static int answer;
	public static int[][] map;
	public static int[] dy = { 1, 0, -1, 0 }; // 우하좌상
	public static int[] dx = { 0, 1, 0, -1 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int n = sc.nextInt();
			map = new int[n][n];
			int cur_x = 0;
			int cur_y = 0;
			int d = 0;
			 for (int i = 1; i <= n * n; i++) {
	                map[cur_x][cur_y] = i;
	                int next_x = cur_x + dx[d];
	                int next_y = cur_y + dy[d];

	                if (next_x >= 0 && next_y >= 0 && next_x < n && next_y < n && map[next_x][next_y] == 0) {
	                    cur_x = next_x;
	                    cur_y = next_y;
	                } else {
	                    d = (d + 1) % 4;
	                    cur_x += dx[d];
	                    cur_y += dy[d];
	                }
	            }
			System.out.printf("#%d\n", tc);
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					System.out.print(map[i][j] + " ");
				}
				System.out.println();
			}
		}
	}
}
