// import java.util.*;
// class Solution {
//     public static int [] dr = {-1,1,0,0};
//     public static int [] dc = {0,0,-1,1};
//     public static int answer,N,M;
//     public static boolean [][] visit;
    
//     public int solution(int[][] land) {
//         N = land.length; // 세로
//         M = land[0].length; // 가로 
//         answer = -1;
//         for(int i = 0; i<M;i++){
//             bfs(land,i);
//         }
        
        
//         return answer;
//     }
    
//     public static void bfs (int [][] land, int start){
//         int cnt = 0;
//         visit = new boolean[N][M];
//         for(int i = 0; i<N; i++){
//             if(land[i][start] == 1 && !visit[i][start]){
//                 Queue<int []> que = new LinkedList<>();
//                 que.add(new int [] {i,start});
//                 visit[i][start] = true;
//                 while(!que.isEmpty()){
//                     int [] cur = que.poll();
//                     int now_r = cur[0];
//                     int now_c = cur[1];
//                     cnt ++;
//                     for(int k = 0; k<4; k++){
//                         int r = now_r + dr[k];
//                         int c = now_c + dc[k];
//                         if(rangechk(r,c) && !visit[r][c] && land[r][c] == 1){
//                             visit[r][c] = true;
//                             que.add(new int [] {r,c});
                            
//                         }
//                     }
//                 }
//             }
//         }
//         answer = Math.max(answer,cnt);
//     }
//     public static boolean rangechk(int r, int c){
//         return r >= 0 && c >= 0 && r < N && c < M;
//     }
// }
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class Solution {

    static int rSize, cSize;
    static int[][] fragments;
    static int fragmentIdx = 1;
    static Map<Integer, Integer> fragmentsInfo = new HashMap<>();
    static boolean[][] visited;
    static int[] dirR = {-1, 1, 0, 0};
    static int[] dirC = {0, 0, -1, 1};

    public int solution(int[][] land) {
        int answer = 0;
        rSize = land.length;
        cSize = land[0].length;
        fragments = new int[rSize][cSize];
        visited = new boolean[rSize][cSize];

        for (int r = 0; r < rSize; r++) {
            for (int c = 0; c < cSize; c++) {
                if (visited[r][c] || land[r][c] == 0) {
                    continue;
                }

                initFragment(land, r, c);
            }
        }

        for (int c = 0; c < cSize; c++) {
            Set<Integer> fragmentTypes = new HashSet<>();
            int tmpMaxAmount = 0;
            for (int r = 0; r < rSize; r++) {
                if (fragments[r][c] > 0) {
                    fragmentTypes.add(fragments[r][c]);
                }
            }

            for (Integer frg : fragmentTypes) {
                tmpMaxAmount += fragmentsInfo.get(frg);
            }

            answer = Math.max(answer, tmpMaxAmount);
        }

        return answer;
    }

    static void initFragment(int[][] land, int r, int c) {
        visited[r][c] = true;
        fragments[r][c] = fragmentIdx;
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{r, c});
        int size = 0;

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            size++;

            for (int d = 0; d < 4; d++) {
                int nxtR = cur[0] + dirR[d];
                int nxtC = cur[1] + dirC[d];

                if (nxtR < 0 || nxtR >= rSize || nxtC < 0 || nxtC >= cSize || visited[nxtR][nxtC]
                        || land[nxtR][nxtC] == 0) {
                    continue;
                }

                visited[nxtR][nxtC] = true;
                fragments[nxtR][nxtC] = fragmentIdx;
                q.add(new int[]{nxtR, nxtC});
            }
        }

        fragmentsInfo.put(fragmentIdx++, size);
    }
}