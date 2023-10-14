import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] dx = { -1, 0, 1, 0 }; // 좌상우하
        int[] dy = { 0, 1, 0, -1 };
        int o = 0;
        int v = 0;

        int r = sc.nextInt();
        int c = sc.nextInt();
        char[][] fence = new char[r][c];
        boolean[][] vi = new boolean[r][c];

        // input
        for (int i = 0; i < r; i++) {
            String s = sc.next();
            for (int j = 0; j < c; j++) {
                fence[i][j] = s.charAt(j);
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                // 방문하지 않았고, 울타리가 아닌 경우
            	if (!vi[i][j] && fence[i][j] != '#') {
                	int sheep = 0;
                    int wolf = 0;
                    Queue<int[]> que = new LinkedList<>();
                    que.add(new int[] { i, j }); // 현재 위치 넣기
                    vi[i][j] = true; // 체크     
                    while (!que.isEmpty()) { // bfs 
                    	int[] next = que.poll();
                        int row = next[0];
                        int column = next[1];
                        if (fence[row][column] == 'v') {
                            wolf++;
                        } else if (fence[row][column] == 'o') {
                            sheep++;
                        }                     
                        for (int k = 0; k < 4; k++) {
                            int ix = row + dx[k];
                            int iy = column + dy[k];
                            // 주변 상하좌우에 방문하지 않았고, #가 아닌 경우
                            if (ix >= 0 && ix < r && iy >= 0 && iy < c
                                    && !vi[ix][iy] && fence[ix][iy] != '#') {
                                // 큐에 넣기
                                que.add(new int[] { ix, iy });
                                vi[ix][iy] = true;
                                // v = 늑대, o = 양
                               
                            }
                        }
                    }
//           디버깅코드         System.out.println("양:"+sheep + " " + "늑대:"+wolf);
                    // 늑대가 양이랑 같거나 크다면 늑대 추가
                    if (wolf >= sheep) {
                        v += wolf;
                    } else {
                        o += sheep;
                    }
                }
            }
        }

        // output
        System.out.println(o + " " + v);
    }
}
