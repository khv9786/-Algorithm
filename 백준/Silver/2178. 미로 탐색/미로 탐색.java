import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	public static int[] dy = { 1, -1, 0, 0 };
	public static int[] dx = { 0, 0, -1, 1 };
	public static int N, M;
	public static int[][] maze;
	public static int answer;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		maze = new int[N][M];

		for (int i = 0; i < N; i++) {
			String s = sc.next();
			for (int j = 0; j < M; j++) {
				maze[i][j] = s.charAt(j) - '0';
			}
		}
		bfs();
		System.out.println(answer);
	}

	public static void bfs() {
		Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[] { 0, 0 });
		int[][] distance = new int[N][M];
		distance[0][0] = 1;

		while (!queue.isEmpty()) {
			int[] current = queue.poll();
			int x = current[0];
			int y = current[1];

			if (x == N - 1 && y == M - 1) {
				answer = distance[x][y];
			}

			for (int i = 0; i < 4; i++) {
				int nextX = x + dx[i];
				int nextY = y + dy[i];

				if (isValid(nextX, nextY) && maze[nextX][nextY] == 1 
						&& distance[nextX][nextY] == 0) {
					queue.add(new int[] { nextX, nextY });
					distance[nextX][nextY] = distance[x][y] + 1;
				}
			}
		}
	}

	public static boolean isValid(int x, int y) {
		return x >= 0 && y >= 0 && x < N && y < M;
	}
}
