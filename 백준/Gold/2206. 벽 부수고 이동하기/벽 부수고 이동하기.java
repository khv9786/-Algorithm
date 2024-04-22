import java.io.*;
import java.util.*;

public class Main { // Boj_2206_벽 부수고 이동하기

    static class Me {
        int x, y, dist;
        boolean break_wall;

        public Me(int x, int y, int dist, boolean break_wall) {
            this.x = x;
            this.y = y;
            this.dist = dist;
            this.break_wall = break_wall;
        }
    }

    static int N, M, answer;
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {1, -1, 0, 0};
    static boolean[][] map;
    static boolean[][] visit;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        answer = -1;
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            for (int j = 0; j < M; j++) {
                if (input.charAt(j) == '1') {
                    map[i][j] = true; // 갈수 있음 == true;
                }
            }
        }

        answer = bfs(0, 0);
        System.out.println(answer);
    }

    public static int bfs(int x, int y) {
        boolean[][][] visited = new boolean[N][M][2];
        Queue<Me> queue = new LinkedList<>();
        queue.offer(new Me(x, y, 1, false));
        visited[x][y][0] = true; // 벽 부쉈는지 체크용

        while (!queue.isEmpty()) {
            Me cur = queue.poll();
            if (cur.x == N - 1 && cur.y == M - 1) {
                return cur.dist; // 한번에 도착하는 경우.
            }

            for (int i = 0; i < 4; i++) {
                int nx = cur.x + dx[i];
                int ny = cur.y + dy[i];
                if (range_chk(nx, ny)) {
                    boolean wall = map[nx][ny];
                    boolean canBreakWall = !cur.break_wall && wall; // 벽이 있고 아직 한번도 부수지 않았을때

                    if (wall && canBreakWall && !visited[nx][ny][1]) { // 벽을 부수는 case
                        queue.offer(new Me(nx, ny, cur.dist + 1, true)); // 더이상 벽을 부수지 못함.
                        visited[nx][ny][1] = true;
                    } else if (!wall && !visited[nx][ny][cur.break_wall ? 1 : 0]) { // 일반적인 case
                        queue.offer(new Me(nx, ny, cur.dist + 1, cur.break_wall));
                        visited[nx][ny][cur.break_wall ? 1 : 0] = true;
                    }
                }
            }
        }

        return -1;
    }

    public static boolean range_chk(int x, int y) {
        return 0 <= x && 0 <= y && x < N && y < M;
    }
}