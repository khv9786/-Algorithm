import java.io.*;
import java.util.*;

public class Main {// S1 케빈 베이컨의 6단계 법칙
    public static int N, M;
    public static boolean[][] friend;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        friend = new boolean[N + 1][N + 1];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            friend[a][b] = true;
            friend[b][a] = true;
        }

        User[] baconScore = new User[N + 1];

        for (int i = 1; i <= N; i++) {
            User user = new User(0, i);
            boolean[] visited = new boolean[N + 1];
            Queue<int[]> q = new ArrayDeque<>();
            q.add(new int[]{i, 0});
            visited[i] = true;

            while (!q.isEmpty()) {
                int[] current = q.poll();
                int now = current[0];
                int depth = current[1];

                for (int j = 1; j <= N; j++) {
                    if (friend[now][j] && !visited[j]) {
                        visited[j] = true;
                        q.add(new int[]{j, depth + 1});
                        user.bacon += depth + 1;
                    }
                }
            }
            baconScore[i] = user;
        }

        Arrays.sort(baconScore, 1, N + 1, (o1, o2) -> {
            if (o1.bacon == o2.bacon) {
                return o1.num - o2.num;
            }
            return o1.bacon - o2.bacon;
        });

        System.out.println(baconScore[1].num);
    }

    public static class User {
        int bacon;
        int num;

        public User(int bacon, int num) {
            this.bacon = bacon;
            this.num = num;
        }
    }
}
