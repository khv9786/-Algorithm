import java.util.Scanner;

public class Main {// 14503번 로봇 청소기 53%
	// 로직 구현인듯??
	public static int[][] location;
	public static int[][] room;
	static int[] direction = { 0, 1, 2, 3 }; // 북 동 남 서 -> 청소기 방향
	static int[] dx = { -1, 0, 1, 0 };
	static int[] dy = { 0, 1, 0, -1 };
	static int r, c, d, N, M;
	static int answer = 0;
	static boolean stop = false;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();

		// 벽 1, 청소필요 0, 청소 후 -1,
		room = new int[N][M];

		// r,c -> 현 좌표
		r = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();

		// input
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				room[i][j] = sc.nextInt();
			}
		}
		// logic
		int s = 0;
		while (!stop) {
			s++;
			clean(r, c);
			rangecheck(r, c, d);
		}
		// output
		System.out.println(answer);

	}

	// 현재 위치 청소 메서드
	public static void clean(int x, int y) {
		if (room[x][y] == 0) {
			room[x][y] = -1;
//			System.out.printf("청소 %d,%d\n", x, y);
			answer++;
		}
	}

	// 범위에 청소할 곳이 있나 체크
	public static void rangecheck(int x, int y, int d) {
		boolean clean = false;
		for (int i = 0; i < 4; i++) {
			int curX = x + dx[i];
			int curY = y + dy[i];
			// room 내에 있는지 체크.
			if (curX < 0 || curY < 0 || curX >= N || curY >= M) {
				continue;
			}
			if (room[curX][curY] == 0) {
				clean = true;
			}
		}

		if (clean) {// 청소 할 곳 있으면 회전
			turn(x, y, d);
		}
		if (!clean) {// 청소할 곳 없으면 후진
			backward(x, y, d);
		}

	}

	// 후진 메서드 - 주변에 청소가 필요한 곳이 없다면
	public static void backward(int x, int y, int d) {
		d += 2;
		d %= 4;
		int backX = x + dx[d];
		int backY = y + dy[d];
		// 바라보는 방향을 유지한 채로 한 칸 후진할 수 있다면 한 칸 후진하고 1번으로 돌아간다.
		if (room[backX][backY] != 1 && backY >= 0 && backX >= 0 && backX < N && backY < M) {
			Main.r = backX;
			Main.c = backY;
//			System.out.printf("후진 좌표:%d,%d 방향:%d\n", backX, backY, d);
		} else {
//			System.out.println("종료");
			stop = true;
		}
	}

	// 반시계 90도 회전 메서드 - 주변에 청소 해야하는 곳이 있는 경우
	public static void turn(int x, int y, int d) {
//		System.out.printf("회전 좌표:%d,%d 방향:%d\n", x, y, d);
		d += 3;
		d %= 4;
		Main.d = d;
	
		int forwardX = x + dx[d];
		int forwardY = y + dy[d];
		// 앞칸이 청소되지 않은 빈 칸인 경우 한 칸 전진한다.
		if (room[forwardX][forwardY] == 0 && forwardY >= 0 && forwardX >= 0 && forwardX < N && forwardY < M) {
			Main.r = forwardX;
			Main.c = forwardY;
//			System.out.printf("전진 좌표:%d,%d 방향:%d \n", forwardX, forwardY, d);
		}
	}
}
