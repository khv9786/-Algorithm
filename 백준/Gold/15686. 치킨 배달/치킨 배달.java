import java.io.*;
import java.util.*;

public class Main { // G5 나무 자르기
    static int[][] map;
    static boolean[] chk;
    static int N, M, answer;
    static List<int[]> bbq;
    static List<int[]> home;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // input
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        answer = Integer.MAX_VALUE;
        map = new int[N][N];

        bbq = new ArrayList<>();
        home = new ArrayList<>();


        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if (map[i][j] == 2) {
                    bbq.add(new int[]{i, j});
                }else if(map[i][j] == 1){
                    home.add(new int[]{i, j});
                }
            }
        }
        chk = new boolean[bbq.size()];
        dfs(0, 0);
        System.out.println(answer);
    }

    // M개의 치킨집만 남기기 -> 모든 경우의 수
    public static void dfs(int start, int cnt) {
        if (cnt == M) {
            int totalDistance = getChickenLength();
            answer = Math.min(answer, totalDistance);
            return;
        }

        for (int i = start; i < bbq.size(); i++) {
            chk[i] = true;
            dfs(i + 1, cnt + 1);
            chk[i] = false;
        }
    }

    private static int getChickenLength() {
        int totalDistance = 0;
        for (int[] house : home) {
            int minDistance = Integer.MAX_VALUE;
            for (int i = 0; i < bbq.size(); i++) {
                if (chk[i]) {
                    int[] chicken = bbq.get(i);
                    int distance = Math.abs(house[0] - chicken[0]) + Math.abs(house[1] - chicken[1]);
                    minDistance = Math.min(minDistance, distance);
                }
            }
            totalDistance += minDistance;
        }
        return totalDistance;
    }
}