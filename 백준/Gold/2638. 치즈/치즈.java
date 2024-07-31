import java.io.*;
import java.util.*;

public class Main { // G3 치즈
    static int N, M, cheeseCnt;
    static int[][] cheese;
    static boolean[][] visited;
    static int[] dr = {1, -1, 0, 0};
    static int[] dc = {0, 0, -1, 1};
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        cheese = new int[N][M];
        cheeseCnt = 0;
        int time = 0;

        // input
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                cheese[i][j] = Integer.parseInt(st.nextToken());
                if (cheese[i][j] == 1) {
                    cheeseCnt++;
                }
            }
        }

        while (cheeseCnt != 0) {
            // 외부 공기 체크
            visited = new boolean[N][M];
            init(0, 0);
//            showmetheMap();
            bfs(0, 0);
            time++;
        }

        System.out.println(time);
    }

    public static void bfs(int r, int c) {
        visited = new boolean[N][M];
        Queue<int[]> que = new ArrayDeque<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (cheese[i][j] != 1 || visited[i][j]) {
                    continue;
                }
                que.add(new int[]{i, j});
                visited[i][j] = true;
            }
        }
        while (!que.isEmpty()) {
            int[] now = que.poll();
            int nowR = now[0];
            int nowC = now[1];
            if (nearAirchk(nowR, nowC)) {
                cheese[nowR][nowC] = 2;
                cheeseCnt--;
            }
            for (int k = 0; k < 4; k++) {
                int nextR = nowR + dr[k];
                int nextC = nowC + dc[k];
                if (!rangeChk(nextR, nextC) || cheese[nextR][nextC] != 1) {
                    continue;
                }
                visited[nextR][nextC] = true;
                que.add(new int[]{nextR, nextC});
            }
        }
    }


    public static void outsideAir(int r, int c) {

        visited = new boolean[N][M];
        Queue<int[]> que = new ArrayDeque<>();
        que.add(new int[]{0, 0});
        visited[0][0] = true;
        while (!que.isEmpty()) {
            int[] now = que.poll();
            int nowR = now[0];
            int nowC = now[1];
            if (cheese[nowR][nowC] == 0) {
                cheese[nowR][nowC] = 2;
            }
            for (int k = 0; k < 4; k++) {
                int nextR = nowR + dr[k];
                int nextC = nowC + dc[k];
                if (!rangeChk(nextR, nextC) || cheese[nextR][nextC] == 1) {
                    continue;
                }
                    visited[nextR][nextC] = true;
                    que.add(new int[]{nextR, nextC});
            }
        }
    }


    public static boolean nearAirchk(int r, int c) {
        int cnt = 0;
        for (int k = 0; k < 4; k++) {
            int nextR = r + dr[k];
            int nextC = c + dc[k];
            if (!rangeChk(nextR, nextC)) {
                continue;
            }
            if (cheese[nextR][nextC] == 2) {
                cnt++;
            }
        }
        return cnt >= 2;
    }

    public static boolean rangeChk(int r, int c) {
        return 0 <= r && r < N && 0 <= c && c < M && !visited[r][c];
    }

    public static void showmetheMap() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(cheese[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }


    static void init(int x, int y){
        visited[x][y] = true;
        cheese[x][y] = 2;
        for (int i = 0; i < 4; i++) {
            int newX = x + dr[i];
            int newY = y + dc[i];
            if(initCheck(newX, newY)) {
                init(newX, newY);
            }
        }
    }

    static boolean initCheck(int x, int y){
        return rangeChk(x,y) && cheese[x][y] != 1;
    }
}