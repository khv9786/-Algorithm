import java.io.*;
import java.util.*;

public class Main {
    public static int N;
    public static int[][] map;
    public static Shark babyShark;
    public static int[] dr = {-1, 1, 0, 0}; // 상하좌우 이동
    public static int[] dc = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        map = new int[N][N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                int tmp = Integer.parseInt(st.nextToken());
                map[i][j] = tmp;
                if (tmp == 9) {
                    babyShark = new Shark(i, j, 2, 0);
                    map[i][j] = 0; // 상어 초기 위치는 빈 칸으로 변경
                }
            }
        }

        int time = 0;
        while (true) {
            Fish target = findYummyFish();
            if (target == null) break;

            int distance = target.distance;
            time += distance;
            babyShark.r = target.r;
            babyShark.c = target.c;
            babyShark.eatCnt++;
            if (babyShark.eatCnt == babyShark.size) {
                babyShark.size++;
                babyShark.eatCnt = 0;
            }
            map[target.r][target.c] = 0; // 물고기를 먹은 자리는 빈 칸으로 변경
        }

        System.out.println(time);
    }

    public static Fish findYummyFish() {
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[N][N];
        queue.add(new int[]{babyShark.r, babyShark.c, 0});
        visited[babyShark.r][babyShark.c] = true;

        PriorityQueue<Fish> fishQueue = new PriorityQueue<>((f1, f2) -> {
            if (f1.distance != f2.distance) return f1.distance - f2.distance;
            if (f1.r != f2.r) return f1.r - f2.r;
            return f1.c - f2.c;
        });

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int r = cur[0], c = cur[1], dist = cur[2];

            for (int i = 0; i < 4; i++) {
                int nr = r + dr[i];
                int nc = c + dc[i];

                if (nr >= 0 && nr < N && nc >= 0 && nc < N && !visited[nr][nc]) {
                    if (map[nr][nc] <= babyShark.size) { // 이동 가능
                        visited[nr][nc] = true;
                        queue.add(new int[]{nr, nc, dist + 1});
                        if (map[nr][nc] > 0 && map[nr][nc] < babyShark.size) {
                            fishQueue.add(new Fish(nr, nc, map[nr][nc], dist + 1));
                        }
                    }
                }
            }
        }

        if (fishQueue.isEmpty()) {
            return null;
        }

        return fishQueue.poll();
    }

    public static class Fish {
        int r, c, size, distance;

        public Fish(int r, int c, int size, int distance) {
            this.r = r;
            this.c = c;
            this.size = size;
            this.distance = distance;
        }
    }

    public static class Shark {
        int r, c, size, eatCnt;

        public Shark(int r, int c, int size, int eatCnt) {
            this.r = r;
            this.c = c;
            this.size = size;
            this.eatCnt = eatCnt;
        }
    }
}
