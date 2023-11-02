import java.util.*;

public class Main { // 2667번 단지번호붙이기 S1 42%
	// bfs 문제네오

	public static int N;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		int[][] map = new int[N][N];
		boolean[][] chk = new boolean[N][N];
		List<Integer> list = new ArrayList<>();
		int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};

		for (int i = 0; i < N; i++) {
			String s = sc.next();
			for (int j = 0; j < N; j++) {
				map[i][j] = s.charAt(j) - '0';
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (map[i][j] == 1 && !chk[i][j]) {
					Queue<int[]> que = new LinkedList<>();
					int house = 0;
					chk[i][j] = true;
					que.add(new int[] { i, j });
					while (!que.isEmpty()) {
						house += 1;
						int[] cur = que.poll();
						for (int k = 0; k < 4; k++) {
							int cur_X = cur[0] + dx[k];
							int cur_Y = cur[1] + dy[k];
							if (Rangechk(cur_X, cur_Y) && map[cur_X][cur_Y] == 1 && !chk[cur_X][cur_Y]) {
								que.add(new int[] { cur_X, cur_Y });
								chk[cur_X][cur_Y] = true;
							}
						}
					}
					list.add(house);
				}
			}
		}
		Collections.sort(list);
		System.out.println(list.size());
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	}

	public static boolean Rangechk(int x, int y) {
		return x >= 0 && y >= 0 && x < N && y < N;
	}
}
