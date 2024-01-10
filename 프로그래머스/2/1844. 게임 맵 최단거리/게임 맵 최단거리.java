import java.util.*;

class Solution {
    
    static int n, m;
    static boolean[][] visit;
    static int[][] cost;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public int solution(int[][] maps) {
        n = maps.length;
        m = maps[0].length;
        visit = new boolean[n][m];
        cost = new int[n][m];

        for (int[] row : cost) {
             Arrays.fill(row, 10001);
        }
        cost[0][0] = 1;
        
        Queue<int[]> que = new LinkedList<>();
        que.add(new int[] {0, 0});
        visit[0][0] = true;
        
        while (!que.isEmpty()) {
            int[] cur = que.poll();
            int cur_x = cur[0];
            int cur_y = cur[1];  
        
            for (int i = 0; i < 4; i++) {
                int now_x = cur_x + dx[i];
                int now_y = cur_y + dy[i];
    
                if (range_chk(now_x, now_y) && !visit[now_x][now_y] && maps[now_x][now_y] == 1) {
                    visit[now_x][now_y] = true;
                    que.add(new int[] {now_x, now_y});
                    cost[now_x][now_y] = Math.min(cost[now_x][now_y], cost[cur_x][cur_y] + 1);
                }
            }
        }

        int answer = cost[n-1][m-1] != 10001 ? cost[n-1][m-1] : -1;
        return answer;
    }
    
    public static boolean range_chk(int x, int y) {
        return x >= 0 && y >= 0 && x < n && y < m;
    }
}