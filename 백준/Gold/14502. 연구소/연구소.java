import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Main {// 14502번 연구소 G4 54%
	// 벽 세개 해보고, 바이러스 퍼지게 한 뒤, 안전한 곳 확인
	public static int N;
	public static int M;
	public static int[] dy = { 1, -1, 0, 0 };
	public static int[] dx = { 0, 0, -1, 1 };
	public static int[][] area;
	public static int answer =  Integer.MIN_VALUE;;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		area = new int[N][M];
		// input
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				area[i][j] = sc.nextInt();
			}
		}
		wall(0);
		
		System.out.println(answer);
	}

	//dfs 벽 3개 모든 경우 생성
	public static void wall(int number) {
		if (number == 3) {
			virus();
			return;
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (area[i][j] == 0) {
					area[i][j] = 1;
					wall(number + 1);
					area[i][j] = 0;
				}
			}
		}

	}
	//bfs 바이러스
	public static void virus() {
		int[][] dummy = new int[N][M];
		Queue<int[]> que = new LinkedList<>();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				dummy[i][j] = area[i][j];
				if (area[i][j] == 2) {
					que.add(new int[] { i, j });
				}
			}
		}
		while (!que.isEmpty()) {
			int[] cur = que.poll();
			int row = cur[0];
			int column = cur[1];

			for (int k = 0; k < 4; k++) {
				int Cur_x = row + dx[k];
				int Cur_y = column + dy[k];
				if (Cur_x >= 0 && Cur_x < N && Cur_y >= 0 &&
						Cur_y < M && dummy[Cur_x][Cur_y] == 0) {
					que.add(new int[] { Cur_x, Cur_y });
					dummy[Cur_x][Cur_y] = 2;
				}
			}
		}
		ChkArea(dummy);
	}

	public static void ChkArea(int[][] dummy) {
		int Max = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if(dummy[i][j] == 0) {
					Max += 1;
				}
			}
		}
		answer = Math.max(Max, answer);
	}
}
