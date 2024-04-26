import java.io.*;
import java.util.*;

public class Main { // Boj_1600_말이 되고픈 원숭이

    static class Monkey {
        int x, y, dist, left_horse_step;

        public Monkey(int x, int y, int dist, int left_horse_step) {
            this.x = x;
            this.y = y;
            this.dist = dist;
            this.left_horse_step = left_horse_step;
        }
    }

    static int H, W, answer, K;
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {1, -1, 0, 0};
    static int[][] monkey_step = {{-1, -2}, {-2, -1}, {-2, 1}, {-1, 2}, {1, -2}, {2, -1}, {2, 1}, {1, 2}};
    static int[][] map;
    static boolean[][][] visit;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        answer = -1;
        K = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        W = Integer.parseInt(st.nextToken()); // 가로
        H = Integer.parseInt(st.nextToken()); // 세로
        map = new int[H][W];

        for (int i = 0; i < H; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < W; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        answer = bfs(0, 0);
        System.out.println(answer);
    }

    public static int bfs(int x, int y) {
        visit = new boolean[H][W][K + 2];
        Queue<Monkey> que = new ArrayDeque<>();
        que.offer(new Monkey(x, y, 0, 0));
        visit[x][y][0] = true; // 말 스텝 체크
        // 벽 부수기와 동일, 말이 스텝한곳을 따로 체크해야 일반 원숭이 스텝도 체킹 가능.

        while (!que.isEmpty()) {
            Monkey cur = que.poll();
            if (cur.x == H - 1 && cur.y == W - 1) {
                return cur.dist; // 한번에 도착하는 경우도 체크하려고
            }

            for (int i = 0; i < 4; i++) { // 일반 원숭이
                int nx = cur.x + dx[i];
                int ny = cur.y + dy[i];
                if (range_chk(nx, ny) && map[nx][ny] != 1 && !visit[nx][ny][cur.left_horse_step]) { // 아 visit 조건 ㅡㅡ
                    que.add(new Monkey(nx, ny, cur.dist + 1, cur.left_horse_step));
                    visit[nx][ny][cur.left_horse_step] = true;
                }
            }
            if (cur.left_horse_step < K) { // 말 스텝
                for (int i = 0; i < 8; i++) {
                    int nx = cur.x + monkey_step[i][0];
                    int ny = cur.y + monkey_step[i][1];
                    if (range_chk(nx, ny) && map[nx][ny] != 1 && !visit[nx][ny][cur.left_horse_step+1]) {
                        que.add(new Monkey(nx, ny, cur.dist + 1, cur.left_horse_step + 1));
                        visit[nx][ny][cur.left_horse_step + 1] = true;
                    }
                }
            }
        }
        return -1;
    }

    public static boolean range_chk(int x, int y) {
        return 0 <= x && 0 <= y && x < H && y < W;
    }
}