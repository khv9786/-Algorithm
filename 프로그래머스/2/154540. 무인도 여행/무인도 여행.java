import java.io.*;
import java.util.*;

class Solution {
    
    public static boolean[][] chk;
    public static int[] dr = {-1, 1, 0, 0};
    public static int[] dc = {0, 0, -1, 1};
    
    public static List<Integer> solution(String[] maps) {
            chk = new boolean[maps.length][maps[0].length()];
            List<Integer> land = new ArrayList<>();

            for (int i = 0; i < maps.length; i++) {
                for (int j = 0; j < maps[i].length(); j++) {
                    if (maps[i].charAt(j) == 'X' || chk[i][j]) {
                        continue;
                    }
                    land.add(bfs(i, j, maps));
                }
            }

            if(land.isEmpty()){
                land.add(-1);
            }else{
                land.sort(Comparator.naturalOrder());
            }
            return land;
        }
    
     public static int bfs(int r, int c, String[] maps) {
        Queue<int[]> que = new LinkedList<>();
        int scale = maps[r].charAt(c) - '0';  // 초기 scale 값 설정
        chk[r][c] = true;
        que.offer(new int[]{r, c});
        while (!que.isEmpty()) {
            int[] now = que.poll();
            int now_r = now[0];
            int now_c = now[1];
            for (int i = 0; i < 4; i++) {
                int next_r = now_r + dr[i];
                int next_c = now_c + dc[i];
                if (langeChk(next_r, next_c, maps)) {
                    chk[next_r][next_c] = true;
                    que.offer(new int[]{next_r, next_c});
                    scale += maps[next_r].charAt(next_c) - '0';
                }
            }
        }
        return scale;
    }
    public static boolean langeChk (int r, int c,String [] maps){
        return(r >= 0 && r < maps.length && c >= 0 && c < maps[0].length() && !chk[r][c] && maps[r].charAt(c) != 'X');
    }
    
}