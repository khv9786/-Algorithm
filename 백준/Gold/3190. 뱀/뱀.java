import java.io.*;
import java.util.*;

public class Main { // G4 뱀

    public static int N, K, L;
    public static int[] dr = {-1, 0, 1, 0};
    public static int[] dc = {0, 1, 0, -1};
    public static int[][] map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        K = Integer.parseInt(br.readLine());// 사과
        map = new int[N][N];

        for (int j = 0; j < K; j++) {
            st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken()) - 1;
            int c = Integer.parseInt(st.nextToken()) - 1;
            map[r][c] = 7;
        }

        L = Integer.parseInt(br.readLine());
        Queue<DirectionChange> que = new LinkedList<>();
        for (int i = 0; i < L; i++) {
            st = new StringTokenizer(br.readLine());
            int time = Integer.parseInt(st.nextToken());
            String direction = st.nextToken(); // L -> 왼쪽 -1, D -> 오른쪽 +1
            que.add(new DirectionChange(time, direction));
        }

        Snake snake = new Snake(0, 0, 1);
        Deque<int[]> snakeBody = new LinkedList<>();
        snakeBody.add(new int[]{0, 0});
        map[0][0] = 1;
        int time = 0;

        while (true) {
//            System.out.println("현재 위치: " +snake.r+" "+snake.c);
            if (!que.isEmpty() && que.peek().time == time) {
                DirectionChange directionChange = que.poll();
                if (directionChange.time == time) {
                    if (directionChange.direction.equals("L")) {
                        snake.direction = (snake.direction + 3) % 4;
//                        System.out.println("좌회전: "+snake.direction);
                    } else if (directionChange.direction.equals("D")) {
                        snake.direction = (snake.direction + 1) % 4;
//                        System.out.println("우회전: "+snake.direction);
                    }
                }
            }
            time += 1;
            int nextR = snake.r + dr[snake.direction];
            int nextC = snake.c + dc[snake.direction];

//            for (int i = 0; i < N; i++) {
//                for (int j = 0; j < N; j++) {
//                    System.out.print(map[i][j] + " ");
//                }
//                System.out.println();
//            }

            if (rangeChk(nextR, nextC, map)) {
                System.out.println(time);
                break;
            }

            if (map[nextR][nextC] == 7) { // 사과가 있는 경우
                snakeBody.addFirst(new int[]{nextR, nextC});
            } else { // 사과가 없는 경우
                snakeBody.addFirst(new int[]{nextR, nextC});
                int[] tail = snakeBody.removeLast();
                map[tail[0]][tail[1]] = 0;
            }

            snake.r = nextR;
            snake.c = nextC;
            map[nextR][nextC] = 1;
        }
    }

    static class DirectionChange {
        int time;
        String direction;

        public DirectionChange(int time, String direction) {
            this.time = time;
            this.direction = direction;
        }
    }

    static class Snake {
        int r, c;
        int direction;

        public Snake(int r, int c, int direction) {
            this.r = r;
            this.c = c;
            this.direction = direction;
        }
    }

    public static boolean rangeChk(int r, int c, int[][] map) {
        return r < 0 || c < 0 || r >= N || c >= N || map[r][c] == 1;
    }
}
